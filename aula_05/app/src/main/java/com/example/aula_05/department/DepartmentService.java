package com.example.aula_05.department;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DepartmentService {

    @GET("departament")
    Call<List<Department>> getDepartments();

    @GET("departament/{id}")
    Call<Department> getDepartmentById(@Path("id") int id);

}
