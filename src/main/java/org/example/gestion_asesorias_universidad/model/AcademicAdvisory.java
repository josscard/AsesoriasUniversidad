package org.example.gestion_asesorias_universidad.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;


public class AcademicAdvisory extends AdvisorySession{

    public AcademicAdvisory(int id, Student student, Advisory advisory, LocalDateTime dateTime) {
        super(id, student, advisory, dateTime);
    }

    public String getDetails() {
        return "Tu asesoria academica sera con "+ getAdvisory().getNameAdvisory() + " a las " + getDateTime() + ".";
    }
}
