package com.example.aula_05.department;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aula_05.R;
import com.example.aula_05.RetrofitConfig;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DepartmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
    }

    public void getDepartmentById(View view) {

        EditText editText = findViewById(R.id.edFindDepartment);
        int idDepartment = Integer.parseInt(editText.getText().toString());

        Call<Department> ligacao = new RetrofitConfig().getDepartmentService().getDepartmentById(idDepartment);

        ligacao.enqueue(new Callback<Department>() {
            @Override
            public void onResponse(Call<Department> call, Response<Department> response) {

                Department department = response.body();

                TextView textView = findViewById(R.id.tvDepartments);
                textView.setText(department.getName());

                Toast.makeText(getApplicationContext(), "SUCESSO!", Toast.LENGTH_SHORT).show();
            }


            @Override
            public void onFailure(Call<Department> call, Throwable t) {

                Toast.makeText(getApplicationContext(), "ERRO!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void getAllDepartments(View view) {

        Call<List<Department>> ligacao = new RetrofitConfig().getDepartmentService().getDepartments();

        ligacao.enqueue(new Callback<List<Department>>() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onResponse(Call<List<Department>> call, Response<List<Department>> response) {

                List<Department> departments = response.body();

                for (Department department : departments){
                    TextView textView = findViewById(R.id.tvDepartments);

                    textView.append(department.getName() + " \n");
                }
                Toast.makeText(getApplicationContext(), "SUCESSO!", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<List<Department>> call, Throwable t) {

                Toast.makeText(getApplicationContext(), "ERRO!", Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void createDepartment(View view) {
    }

    public void updateDepartment(View view) {
    }

    public void deleteDepartment(View view) {
    }
}