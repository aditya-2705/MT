package com.example.studentlist;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView =
                findViewById(R.id.studentRecyclerView);

        databaseHelper = new DatabaseHelper(this);
        List<Student> studentList = new ArrayList<>();

        try (Cursor cursor = databaseHelper.getAllStudents()) {
            while (cursor.moveToNext()) {
                int id = cursor.getInt(
                        cursor.getColumnIndexOrThrow("id"));
                String name = cursor.getString(
                        cursor.getColumnIndexOrThrow("name"));
                String course = cursor.getString(
                        cursor.getColumnIndexOrThrow("course"));

                studentList.add(new Student(id, name, course));
            }
        }

        recyclerView.setAdapter(new StudentAdapter(studentList));
    }

    @Override
    protected void onDestroy() {
        if (databaseHelper != null) {
            databaseHelper.close();
        }
        super.onDestroy();
    }
}
