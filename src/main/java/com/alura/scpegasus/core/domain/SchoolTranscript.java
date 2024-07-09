package com.alura.scpegasus.core.domain;

import java.util.List;

public class SchoolTranscript {
    private Integer transcriptId;
    private Student student;
    private List<Activity> activities;

    public SchoolTranscript(Integer historyId, Student student, List<Activity> activities) {
        this.transcriptId = historyId;
        this.student = student;
        this.activities = activities;
    }

    public Integer getTranscriptId() {
        return transcriptId;
    }

    public Student getStudent() {
        return student;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}
