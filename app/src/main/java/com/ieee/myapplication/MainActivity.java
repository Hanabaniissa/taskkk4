package com.ieee.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buGetAge(View view) {
        EditText editText=findViewById(R.id.atgh);
        String YearOfBirth = editText.getText().toString();


        Intent intent=new Intent(this,MainActivity2.class);

        intent.putExtra("YearOfBirth",YearOfBirth);
        startActivity(intent);
    }
}