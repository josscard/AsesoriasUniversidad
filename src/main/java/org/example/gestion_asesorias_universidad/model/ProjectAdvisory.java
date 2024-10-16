package org.example.gestion_asesorias_universidad.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class ProjectAdvisory extends AdvisorySession{
    private final String projectName;



    public ProjectAdvisory(String id, Student student, Advisory advisory, LocalDateTime dateTime, String projectName) {
        super(id, student, advisory, dateTime);
        this.projectName = projectName;

    }

    public String getProjectName() {
        return projectName;
    }

    @Override
    public String getDetails() {
        return "La asesoria del proyecto para "+projectName+ " es con "+ getAdvisory().getNameAdvisory() + " a las" + getDateTime() + ".";
    }


}
