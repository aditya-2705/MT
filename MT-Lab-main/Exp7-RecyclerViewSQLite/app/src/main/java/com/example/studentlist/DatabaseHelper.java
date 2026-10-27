package com.example.studentlist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "StudentDB";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_STUDENTS = "students";
    private static final String COL_ID = "id";
    private static final String COL_NAME = "name";
    private static final String COL_COURSE = "course";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_STUDENTS + " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_NAME + " TEXT, " +
                COL_COURSE + " TEXT)";
        db.execSQL(query);

        insertInitialStudent(db, "Amit Sharma", "MCA");
        insertInitialStudent(db, "Priya Patil", "MBA");
        insertInitialStudent(db, "Rahul Jadhav", "BCA");
        insertInitialStudent(db, "Sneha Deshmukh", "MCA");
    }

    private void insertInitialStudent(SQLiteDatabase db,
                                      String name, String course) {
        ContentValues values = new ContentValues();
        values.put(COL_NAME, name);
        values.put(COL_COURSE, course);
        db.insert(TABLE_STUDENTS, null, values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,
                          int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENTS);
        onCreate(db);
    }

    public Cursor getAllStudents() {
        SQLiteDatabase db = getReadableDatabase();
        return db.query(
                TABLE_STUDENTS,
                null,
                null,
                null,
                null,
                null,
                COL_NAME + " ASC"
        );
    }
}
