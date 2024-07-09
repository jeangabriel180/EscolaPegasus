package com.alura.scpegasus.core.domain;

public class Activity {
    private Integer id;
    private String name;
    private Course course;
    private Student student;
    private Double score;

    public Activity(Integer activityId, String activityName, Course course, Student student, Double activityScore) {
        this.id = activityId;
        this.name = activityName;
        this.course = course;
        this.student = student;
        this.score = activityScore;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public Double getScore() {
        return score;
    }
}
