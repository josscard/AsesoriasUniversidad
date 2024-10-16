package org.example.gestion_asesorias_universidad.model;


import java.time.LocalDateTime;


public class AcademicAdvisory extends AdvisorySession{

    public AcademicAdvisory(String id, Student student, Advisory advisory, LocalDateTime dateTime) {
        super(id, student, advisory, dateTime);
    }

    public AcademicAdvisory() {
    }

    @Override
    public String getDetails() {
        return "Tu asesoria academica sera con "+ getAdvisory().getNameAdvisory() + " a las " + getDateTime() + ".";
    }


}
