package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaring widgets
    EditText editTextNumber;
    TextView textView, textView2, textView3, valueinPounds;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiating widgets
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        valueinPounds = findViewById(R.id.valueOfPounds);

        editTextNumber = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);

        // Adding a Click Event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kilo to Pounds
                ConvertFromKiloToPound();
            }
        });
    }

    private void ConvertFromKiloToPound() {
        String valueEnteredInKILO = editTextNumber.getText().toString();
        double kilo = Double.parseDouble(valueEnteredInKILO);
        double pounds = kilo * 2.205;
        valueinPounds.setText("" + pounds);
    }
}
