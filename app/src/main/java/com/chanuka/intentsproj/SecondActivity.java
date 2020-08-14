package com.chanuka.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    TextView textView;
    String message1,message2;
    double numb1,numb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn1=findViewById(R.id.button2);
        btn2=findViewById(R.id.button3);
        btn3=findViewById(R.id.button4);
        btn4=findViewById(R.id.button5);
        textView= findViewById(R.id.textView);


        Intent intent = getIntent();
        message1 = intent.getStringExtra("Num1");
        message2 = intent.getStringExtra("Num2");

        TextView textView1 = findViewById(R.id.num1);
        textView1.setText(message1);
        TextView textView2 = findViewById(R.id.num2);
        textView2.setText(message2);

    }

    @Override
    protected void onResume() {
        super.onResume();

        numb1 = Double.parseDouble(message1);
        numb2 = Double.parseDouble(message2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(message1+" + "+message2+" = "+(numb1+numb2));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                textView.setText(message1+" - "+message2+" = "+(numb1-numb2));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                textView.setText(message1+" * "+message2+" = "+(numb1*numb2));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                textView.setText(message1+" / "+message2+" = "+(numb1/numb2));
            }
        });
    }
}