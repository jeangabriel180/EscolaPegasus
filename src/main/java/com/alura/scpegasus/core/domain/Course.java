package com.alura.scpegasus.core.domain;

import java.util.List;

public class Course {
    private Integer id;
    private String name;
    private List<Discipline> disciplines;

    public Course(Integer idCourse, String name, List<Discipline> disciplines) {
        this.id = idCourse;
        this.name = name;
        this.disciplines = disciplines;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }
}
