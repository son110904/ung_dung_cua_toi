package com.example.chuyendoidonvi;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.d("KTQD", "Phuong thuc onCreate() duoc goi");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("KTQD", "Phuong thuc onStart() duoc goi");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("KTQD", "Phuong thuc onResume() duoc goi");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("KTQD", "Phuong thuc onPause() duoc goi");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("KTQD", "Phuong thuc onStop() duoc goi");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("KTQD", "Phuong thuc onDestroy() duoc goi");

    }
}
