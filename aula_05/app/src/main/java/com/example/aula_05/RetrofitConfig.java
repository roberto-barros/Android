package com.example.aula_05;

import com.example.aula_05.course.CursoService;
import com.example.aula_05.department.DepartmentService;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://professor-allocation.herokuapp.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public CursoService getCursoService(){
        return retrofit.create(CursoService.class);
    }

    public DepartmentService getDepartmentService() {
        return retrofit.create(DepartmentService.class);
    }

}
