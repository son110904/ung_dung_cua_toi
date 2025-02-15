package com.example.chuyendoidonvi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.chuyendoidonvi.R;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    Button button1;

    EditText editTextText;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("KTQD", "Phương thức onCreate() được gọi");


        TextView textView1 = findViewById(R.id.textView1);
        textView1.setText("S" + new Date().getSeconds());

        button1 = findViewById(R.id.button1);
        editTextText = findViewById(R.id.editTextText);
        button1.setOnClickListener(view->{
            double km = Double.parseDouble(editTextText.getText().toString());
            double mile = km*0.621371192;
            textView1.setText(mile+" miles");
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("KTQD", "Phương thức onStart() được gọi");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("KTQD", "Phương thức onResume() được gọi");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("KTQD", "Phương thức onPause() được gọi");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("KTQD", "Phương thức onStop() được gọi");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("KTQD", "Phương thức onDestroy() được gọi");
    }
}