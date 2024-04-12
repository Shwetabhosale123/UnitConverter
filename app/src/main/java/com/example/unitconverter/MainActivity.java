package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.converterBtn);
        textView = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getting the user input
                //String inputText= editText.getText().toString();
                Double input = Double.valueOf(editText.getText().toString());

//                    //converting string into double
//                    double kilos= Double.parseDouble(inputText);

                //converting kilos into pounds
                double pounds = makeConversion(input);

                //display conversion result
                textView.setText("" + pounds);

            }
        });
    }

    public double makeConversion(double kilos) {
        //1 kilos = 2.20462 pounds
        return kilos * 2.20462;
    }
}