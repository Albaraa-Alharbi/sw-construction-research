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
    // SharedPreferences sp;

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

        // sp = getSharedPreferences("prefs", MODE_PRIVATE);
        // load();

        // editDate.setOnClickListener(v -> showDate());
        // btnSave.setOnClickListener(v -> save());
    }

    void save() {
        String name = ""; // editName.getText().toString();
        String date = ""; // editDate.getText().toString();
        String g = "";

        // int id = groupGender.getCheckedRadioButtonId();
        // if (id == R.id.rbMale) g = "male";
        // else if (id == R.id.rbFemale) g = "female";

        System.out.println("Saved (mock)");
    }

    void load() {
        // String name = sp.getString("name", "");
        // String date = sp.getString("date", "");
        // String g = sp.getString("gender", "");

        System.out.println("Loaded (mock)");
    }

    void showDate() {
        // Calendar c = Calendar.getInstance();
        // DatePickerDialog dp = new DatePickerDialog(this, (view, y1, m1, d1) -> {
        //     String s = y1 + "-" + (m1 + 1) + "-" + d1;
        //     editDate.setText(s);
        // }, y, m, d);

        System.out.println("ShowDate (mock)");
    }
}