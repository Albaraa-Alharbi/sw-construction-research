/*
SW Construction Research Project
LLM-based Code Refactoring System
Author: Albaraa Alharbi
Generated: 2026
DO NOT DISTRIBUTE WITHOUT PERMISSION
*/

//package malefemale.lab4;

/*
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
⬇  THIS SECTION IS INTENTIONALLY DISABLED  ⬇
All Android-related code below is converted into comments
for static analysis purposes only.

Reason:
- Android framework dependencies are not supported in this environment
- Code is preserved for documentation & cognitive analysis

⬇  DO NOT TREAT THE FOLLOWING AS EXECUTABLE ANDROID CODE  ⬇
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
*/

// import androidx.appcompat.app.AppCompatActivity;
// import android.app.DatePickerDialog;
// import android.os.Bundle;
// import android.widget.*;
// import android.view.View;
// import android.content.SharedPreferences;
// import java.util.Calendar;

// public class MainActivity extends AppCompatActivity {
public class MainActivity {

    // EditText editName, editDate;
    // RadioGroup groupGender;
    // RadioButton rbMale, rbFemale;
    // Button btnSave, btnClear;
    // SharedPreferences sharedPreferences;

    public void onCreate(/* Bundle savedInstanceState */) {
        // super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        // editName = findViewById(R.id.editName);
        // editDate = findViewById(R.id.editDate);
        // groupGender = findViewById(R.id.groupGender);
        // rbMale = findViewById(R.id.rbMale);
        // rbFemale = findViewById(R.id.rbFemale);
        // btnSave = findViewById(R.id.btnSave);
        // btnClear = findViewById(R.id.btnClear);

        // sharedPreferences = getSharedPreferences("prefs", MODE_PRIVATE);
        // load();

        // editDate.setOnClickListener(v -> displayDate());
        // btnSave.setOnClickListener(v -> saveData());
    }

    void saveData() {
        String userName = ""; // editName.getText().toString();
        String selectedDate = ""; // editDate.getText().toString();
        String gender = "";

        // int genderId = groupGender.getCheckedRadioButtonId();
        // if (genderId == R.id.rbMale) gender = "male";
        // else if (genderId == R.id.rbFemale) gender = "female";

        System.out.println("Saved (mock)");
    }

    void load() {
        // String userName = sharedPreferences.getString("name", "");
        // String selectedDate = sharedPreferences.getString("date", "");
        // String gender = sharedPreferences.getString("gender", "");

        System.out.println("Loaded (mock)");
    }

    void displayDate() {
        // Calendar calendar = Calendar.getInstance();
        // DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view, year, month, day) -> {
        //     String dateString = year + "-" + (month + 1) + "-" + day;
        //     editDate.setText(dateString);
        // }, year, month, day);

        System.out.println("ShowDate (mock)");
    }
}