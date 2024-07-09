package com.alura.scpegasus.core.domain;

import java.time.LocalTime;

public class Discipline {
    private Integer id;
    private LocalTime classTime;
    private String name;
    private Professor professor;
    private String teachingMaterials;

    public Discipline(Integer idDiscipline, LocalTime classTime, String title, Professor professor, String teachingMaterials) {
        this.id = idDiscipline;
        this.classTime = classTime;
        this.name = title;
        this.professor = professor;
        this.teachingMaterials = teachingMaterials;
    }

    public Integer getId() {
        return id;
    }

    public LocalTime getClassTime() {
        return classTime;
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getTeachingMaterials() {
        return teachingMaterials;
    }
}
