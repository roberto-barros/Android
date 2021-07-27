package com.example.aula3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendText(View view) {
        TextView txt = findViewById(R.id.edText1);
        String message = txt.getText().toString();

        insertOrUpdateMessage("messageId", message);

        Intent messenger = new Intent(this, MainActivity2.class);
        messenger.putExtra("MESSAGE", message);

        startActivity(messenger);
    }

    public void changeView(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("MESSAGE", "");

        startActivity(intent);
    }

    //Criar Database
    private SharedPreferences getMyPreferences(){
        return getSharedPreferences("DataBase", Context.MODE_PRIVATE);
    }

    //Inserir Registros
    private void insertOrUpdateMessage(String key, String value){
        SharedPreferences.Editor editor = getMyPreferences().edit();
        editor.putString(key, value);
        editor.apply();
    }



}