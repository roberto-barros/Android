package com.example.aula_05.course;

import android.renderscript.Allocation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("allocations")
public class Curso {

    private int id;
    private String name;
    private Allocation allocations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Allocation getAllocations() {
        return allocations;
    }

    public void setAllocations(Allocation allocations) {
        this.allocations = allocations;
    }
}
