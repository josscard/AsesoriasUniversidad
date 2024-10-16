package org.example.gestion_asesorias_universidad.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public abstract class AdvisorySession {
    private int id;
    private Student student;
    private Advisory advisory;
    private LocalDateTime dateTime;

    public abstract String getProjectName();
}
