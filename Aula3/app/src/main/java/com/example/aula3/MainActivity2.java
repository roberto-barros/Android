package com.example.aula3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getIntent().getStringExtra("");

        String message = getMessage("messageId");

        TextView textView = findViewById(R.id.tvText2);
        textView.setText(message);

    }

    //Criar ou atualizar Database
    private SharedPreferences getMyPreferences(){
        return getSharedPreferences("DataBase", Context.MODE_PRIVATE);
    }

    //Buscar no Database
    private String getMessage(String key){
        return getMyPreferences().getString(key, "MESSAGE");
    }

}