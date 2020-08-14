package com.chanuka.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button button1 ,button2;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        button1= findViewById(R.id.button);
        button2= findViewById(R.id.button6);

    }

    @Override
    protected void onResume() {
        super.onResume();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button"; //Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();



                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

                EditText editText1 =(EditText)findViewById(R.id.num1);
                String num1 = editText1.getText().toString();
                intent.putExtra("Num1",num1);
                EditText editText2 =(EditText)findViewById(R.id.num2);
                String num2 = editText2.getText().toString();
                intent.putExtra("Num2",num2);

                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}