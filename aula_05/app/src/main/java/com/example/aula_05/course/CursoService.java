package com.example.aula_05.course;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CursoService {

    @GET("course")
    Call<List<Curso>> getCursos();

    @GET("course/{id}")
    Call<Curso> getCourseById(@Path("id") int id);



}
