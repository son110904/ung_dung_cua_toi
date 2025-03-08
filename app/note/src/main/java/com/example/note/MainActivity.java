package com.example.note;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    EditText noteEditText;
    Button saveButton;
    String fileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView = findViewById(R.id.calendarView);
        noteEditText = findViewById(R.id.noteEditText);
        saveButton = findViewById(R.id.saveButton);


        // Xử lý sự kiện khi ngày trên CalendarView được chọn
        calendarView.setOnDateChangeListener((calendarView, year, month, dayOfMonth) -> {
            SharedPreferences pref = getPreferences(MODE_PRIVATE);
            pref.edit().putInt("year", year).apply();
            pref.edit().putInt("month", month).apply();
            pref.edit().putInt("dayOfMonth", dayOfMonth).apply();

            fileName = String.format("%02d_%02d_%04d", dayOfMonth, month + 1, year);
            pref.edit().putInt("year", year).apply();
            pref.edit().putInt("month", month).apply();
            pref.edit().putInt("dayOfMonth", dayOfMonth).apply();
            noteEditText.setText("");
            try {
                FileInputStream fis = openFileInput(fileName);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader bufferedReader = new BufferedReader(isr);
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                fis.close();
                noteEditText.setText(sb);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        saveButton.setOnClickListener(view -> {
            String noteContent = noteEditText.getText().toString();
            try {
                // Ghi nội dung vào file
                FileOutputStream fos = openFileOutput(fileName, MODE_PRIVATE);
                fos.write(noteContent.getBytes());
                fos.close();
                Toast.makeText(this, "Đã lưu ghi chú", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                e.printStackTrace();
                Toast.makeText(this, "Lỗi khi lưu ghi chú", Toast.LENGTH_LONG).show();
            }
        });

    }
}
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//
//        SharedPreferences pref = getPreferences(MODE_PRIVATE);
//        pref.edit()
//                .putInt("fontSize", 30).
//                putString("name","Son").
//                apply();

//        int fontSize = pref.getInt("fontSize", 20);