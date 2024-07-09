package com.alura.scpegasus.core.domain;

public class Student {
    private Integer id;
    private String name;
    private String phoneNumber;
    private String email;
    private SchoolTranscript schoolHistory;
    private Adress adress;

    public Student(Integer id, String name, String phoneNumber, String email, SchoolTranscript schoolHistory, Adress adress) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.schoolHistory = schoolHistory;
        this.adress = adress;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public SchoolTranscript getSchoolHistory() {
        return schoolHistory;
    }

    public Adress getAdress() {
        return adress;
    }
}
