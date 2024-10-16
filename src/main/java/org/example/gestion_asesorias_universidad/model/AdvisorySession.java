package org.example.gestion_asesorias_universidad.model;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public abstract class AdvisorySession {
    private String id;
    private Student student;
    private Advisory advisory;
    private LocalDateTime dateTime;

    public AdvisorySession() {
    }

    public AdvisorySession(String id, Student student, Advisory advisory, LocalDateTime dateTime) {
        this.id = id;
        this.student = student;
        this.advisory = advisory;
        this.dateTime = dateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Advisory getAdvisory() {
        return advisory;
    }

    public void setAdvisory(Advisory advisory) {
        this.advisory = advisory;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public abstract String getDetails();

}
