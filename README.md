# SW Construction Research Project

## Evaluating the Impact of GPT-4o-mini-Based Identifier Renaming on Java Maintainability

This research project investigates the effectiveness of GPT-4o-mini in improving Java code maintainability through semantic identifier renaming.

The study applies a constrained instruction-based prompting strategy to automatically improve low-quality identifiers in Java programs while preserving the original program logic and behavior.

Code quality was evaluated using SonarQube metrics before and after refactoring.

---

# Research Objectives

The project aims to evaluate whether Large Language Models (LLMs) can improve software maintainability through readability-focused refactoring techniques.

The primary research questions are:

* Can GPT-4o-mini improve Java maintainability through semantic identifier renaming?
* Does identifier optimization affect Cognitive Complexity?
* Can readability improvements reduce Code Smells while preserving program behavior?

---

# Dataset Source

The 20 Java source files used in this experiment were collected and adapted from the following repository:

[https://github.com/Albaraa-Alharbi/software-engineering-portfolio](https://github.com/Albaraa-Alharbi/software-engineering-portfolio)

The selected files contain low-quality or generic identifiers and were used to evaluate the impact of semantic identifier renaming on maintainability metrics.

---

# Methodology

The experiment follows the following pipeline:

```text
Input Java Code
        ↓
Prompt Engineering
        ↓
GPT-4o-mini Refactoring
        ↓
Clean Output Validation
        ↓
SonarQube Analysis
        ↓
Metrics Comparison
```

The refactoring process was intentionally constrained to:

* Variable renaming
* Method renaming
* Parameter renaming

The system explicitly prevents:

* Class renaming
* Logic modification
* Algorithmic changes
* Structural refactoring
* Code insertion/removal

---

# Technologies Used

| Technology  | Purpose                      |
| ----------- | ---------------------------- |
| Python      | Automation pipeline          |
| GPT-4o-mini | Semantic identifier renaming |
| OpenAI API  | LLM integration              |
| SonarQube   | Static code analysis         |
| Java        | Experimental dataset         |

---

# Project Structure

```text
sw-construction-research/
│
├── config/
│   └── .env.example
│
├── dataset/
│   ├── original/
│   └── refactored/
│
├── prompts/
│   ├── llm_runner.py
│   └── prompt.txt
│
├── reports/
│   ├── project-overleaf.pdf
│   └── project-overview.pdf
│
├── results/
│   ├── before/
│   ├── after/
│   ├── charts/
│   └── comparison.xlsx
│
├── README.md
├── requirements.txt
├── sonar-project.properties
└── .gitignore
```

---

# Installation

## Required External Tools

The following tools are required but are not included in this repository:

* SonarQube
* SonarScanner

Please install and configure them manually before running the analysis.

SonarQube Download:
[https://www.sonarsource.com/products/sonarqube/downloads/](https://www.sonarsource.com/products/sonarqube/downloads/)

SonarScanner Download:
[https://docs.sonarsource.com/sonarqube-server/latest/analyzing-source-code/scanners/sonarscanner/](https://docs.sonarsource.com/sonarqube-server/latest/analyzing-source-code/scanners/sonarscanner/)

---

## 1. Clone the Repository

```bash
git clone https://github.com/Albaraa-Alharbi/sw-construction-research.git
cd sw-construction-research
```

---

## 2. Install Dependencies

```bash
pip install -r requirements.txt
```

---

## 3. Configure Environment Variables

Create an `.env` file inside the `config/` directory:

```env
OPENAI_API_KEY=your_openai_api_key
SONAR_TOKEN=your_sonarqube_token
```

---

# Running the Experiment

## Run GPT-4o-mini Refactoring

```bash
python prompts/llm_runner.py
```

The script:

* Reads Java files from `dataset/original`
* Sends them to GPT-4o-mini
* Applies semantic identifier renaming
* Saves results to `dataset/refactored`

---

## Run SonarQube Analysis

The SonarQube evaluation process was performed locally using a dedicated SonarQube server and SonarScanner.

### Step 1 — Start the SonarQube Server

Navigate to the SonarQube installation directory and run the startup batch file:

```bash
StartSonar.bat
```

After the server starts successfully, SonarQube becomes accessible locally through:

```text
http://localhost:9000
```

---

### Step 2 — Configure SonarScanner

The project uses the provided `sonar-project.properties` configuration file:

```text
sonar.projectKey=SW-Construction-Project
sonar.projectName=SW Construction Project
sonar.sources=dataset/refactored
sonar.host.url=http://localhost:9000
sonar.java.binaries=dataset/refactored
sonar.token=${env.SONAR_TOKEN}
```

---

### Step 3 — Run the SonarScanner CLI

After configuring SonarScanner and verifying the local SonarQube server connection, execute the scanner from the project directory:

```bash
sonar-scanner
```

The scanner connects to the local SonarQube server, uploads the analysis results, and generates the maintainability metrics.

The final reports and visualized metrics can then be accessed through the local SonarQube dashboard at:

```text
http://localhost:9000
```

---

# Evaluation Metrics

The project evaluates the following software quality metrics:

| Metric                 | Description                     |
| ---------------------- | ------------------------------- |
| Code Smells            | Maintainability-related issues  |
| Maintainability Rating | Overall maintainability score   |
| Cognitive Complexity   | Logical/control-flow complexity |

---

# Results Summary

The experiment demonstrated:

* Reduction in Code Smells
* Improvement in Maintainability Rating
* Stable Cognitive Complexity values

This indicates that the improvements were primarily semantic and readability-oriented rather than structural or algorithmic.

---

# Key Findings

* GPT-4o-mini successfully improved identifier readability in many cases.
* Maintainability ratings improved without altering program behavior.
* Cognitive Complexity remained stable due to preservation of control flow.
* Manual inspection revealed possible semantic inconsistencies across related classes.
* Human validation remains important in LLM-assisted refactoring workflows.

---

# Reports

The repository includes:

* IEEE-style research paper
* Detailed project overview report
* SonarQube screenshots
* Comparison charts
* Experimental datasets

---

# Replication Package

This repository serves as the replication package for the research project.

It contains:

* Original dataset
* Refactored dataset
* Prompt design
* Automation scripts
* SonarQube results
* Charts and comparisons
* Final reports

---

# Author

Albaraa Alharbi

Department of Software Engineering
<br>
University of Jeddah
<br>
Jeddah, Saudi Arabia

---

# License

This repository is intended for academic and research purposes.
