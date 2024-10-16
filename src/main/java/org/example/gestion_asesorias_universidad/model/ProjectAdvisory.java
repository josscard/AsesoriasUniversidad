package org.example.gestion_asesorias_universidad.model;

import java.time.LocalDateTime;

public class ProjectAdvisory extends AdvisorySession{
    private String projectName;

    public ProjectAdvisory(int id, Student student, Advisory advisory, LocalDateTime dateTime) {
        super(id, student, advisory, dateTime);
        this.projectName = projectName;

    }

    @Override
    public String getProjectName() {
        return "La asesoria del proyecto para "+projectName+ " es con "+ getAdvisory().getNameAdvisory() + " a las" + getDateTime() + ".";
    }
}
