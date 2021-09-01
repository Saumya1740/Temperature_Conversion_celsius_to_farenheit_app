package com.example.temperature_converter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button c2f;
    private Button f2c;
    private EditText input_edit;
    private TextView output_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c2f = findViewById(R.id.c2f);
        f2c = findViewById(R.id.f2c);
        input_edit = findViewById(R.id.input_edit);
        output_view = findViewById(R.id.output_text);

        userInput();
    }

    private void userInput() {
        c2f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConverterClass CC = new ConverterClass();
                double deg_cel = Double.parseDouble(input_edit.getText().toString());
                double deg_far = CC.c2f_fn(deg_cel);
                output_view.setText(Double.toString(deg_far));

            }
        });

        f2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConverterClass CC = new ConverterClass();
                double deg_far = Double.parseDouble(input_edit.getText().toString());
                double deg_cel = CC.f2c_fn(deg_far);
                output_view.setText(Double.toString(deg_cel));
            }

        });
    }
}
