package com.alura.scpegasus.core.domain;

public class Professor {
    private Integer id;
    private String name;
    private String email;

    public Professor(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
