package com.example.button_counter_lawler;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.*;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    private Button plusB;
    private Button minusB;
    private Button resetB;
    private Button randomB;
    private TextView text;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random randomnum = new Random();
        text = (TextView) this.findViewById(R.id.editTextNumber2);
        text.setText(String.valueOf(count));
        plusB = (Button) this.findViewById(R.id.plusbutton);
        plusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                text.setText(String.valueOf(count));
            }
        });

        minusB = (Button) this.findViewById(R.id.minusbutton);
        minusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                text.setText(String.valueOf(count));
            }
        });

        resetB = (Button) this.findViewById(R.id.resetbutton);
        resetB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                text.setText(String.valueOf(count));
            }
        });
        randomB = (Button) this.findViewById(R.id.randombutton);
        randomB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = randomnum.nextInt(100000);
                text.setText(String.valueOf(count));
            }
        });
    }
}