package com.example.aula_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.aula_05.course.CourseActivity;
import com.example.aula_05.department.DepartmentActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void switchToCourseView(View view) {

        Intent messenger = new Intent(this, CourseActivity.class);
        messenger.putExtra("switchView", "");

        startActivity(messenger);

    }

    public void switchToDepartmentView(View view) {

        Intent messenger = new Intent(this, DepartmentActivity.class);
        messenger.putExtra("switchview", "");

        startActivity(messenger);
    }
}

