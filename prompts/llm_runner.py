"""
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
"""

from openai import OpenAI
from dotenv import load_dotenv
from pathlib import Path
import os
import re

# --------------------------------------------------
# Load environment variables
# --------------------------------------------------
env_path = Path(__file__).resolve().parent.parent / "config" / ".env"
load_dotenv(env_path)

# --------------------------------------------------
# Get API key safely
# --------------------------------------------------
api_key = os.getenv("OPENAI_API_KEY")

if not api_key:
    raise ValueError("OPENAI_API_KEY not found in config/.env")

print("API KEY LOADED: YES")

# --------------------------------------------------
# Initialize OpenAI client
# --------------------------------------------------
client = OpenAI(api_key=api_key)

# --------------------------------------------------
# Define directories
# --------------------------------------------------
base_dir = Path(__file__).resolve().parent.parent

input_dir = base_dir / "dataset" / "original"
output_dir = base_dir / "dataset" / "refactored"

output_dir.mkdir(parents=True, exist_ok=True)

# --------------------------------------------------
# Load prompt
# --------------------------------------------------
prompt_path = Path(__file__).resolve().parent / "prompt.txt"
prompt = prompt_path.read_text(encoding="utf-8")

# --------------------------------------------------
# Get Java files
# --------------------------------------------------
java_files = list(input_dir.glob("*.java"))
print(f"Files found: {len(java_files)}")

# --------------------------------------------------
# Helper: Extract class name
# --------------------------------------------------
def extract_class_name(code_text):
    match = re.search(r'\b(public|abstract|final)?\s*class\s+(\w+)', code_text)
    return match.group(2) if match else None

# --------------------------------------------------
# Helper: Clean output
# --------------------------------------------------
def clean_output(text):
    if not text:
        return ""

    # Remove markdown blocks
    text = text.replace("```java", "")
    text = text.replace("```", "")
    return text.strip()

# --------------------------------------------------
# Process files
# --------------------------------------------------
for file in java_files:

    out_file = output_dir / file.name

    # Skip existing files
    if out_file.exists():
        print(f"Skipping: {file.name}")
        continue

    print(f"Processing: {file.name}")

    code = file.read_text(encoding="utf-8")

    original_class = extract_class_name(code)

    if not original_class:
        print(f"WARNING: No class found in original {file.name}")
        original_class = "UNKNOWN"

    # --------------------------------------------------
    # API Call with retry
    # --------------------------------------------------
    response = None
    for attempt in range(3):
        try:
            response = client.responses.create(
                model="gpt-4o-mini",
                input=prompt + "\n\nJava Code:\n" + code,
                store=False
            )
            break
        except Exception as error:
            print(f"Retry {attempt+1} failed for {file.name}: {error}")

    if not response:
        print(f"FAILED API: {file.name} -> saving original")
        output = code
    else:
        # --------------------------------------------------
        # Token usage
        # --------------------------------------------------
        if hasattr(response, "usage") and response.usage:
            print(f"Tokens used: {response.usage.total_tokens}")

        # --------------------------------------------------
        # Extract output safely
        # --------------------------------------------------
        output = response.output_text if hasattr(response, "output_text") else ""

    # --------------------------------------------------
    # Clean output
    # --------------------------------------------------
    output = clean_output(output)

    # --------------------------------------------------
    # Validation
    # --------------------------------------------------
    if len(output) < 20:
        print(f"WARNING: Short output for {file.name} -> using original")
        output = code

    if "class" not in output:
        print(f"WARNING: No class in output for {file.name} -> using original")
        output = code

    refactored_class = extract_class_name(output)

    if original_class != refactored_class:
        print(f"WARNING: Class name changed in {file.name} -> reverting")
        output = code

    # --------------------------------------------------
    # Header
    # --------------------------------------------------
    header = """/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
*/"""

    # --------------------------------------------------
    # Save file
    # --------------------------------------------------
    final_output = header + "\n\n" + output
    out_file.write_text(final_output, encoding="utf-8")

    print(f"Processed: {file.name}")

print("All tasks completed.")