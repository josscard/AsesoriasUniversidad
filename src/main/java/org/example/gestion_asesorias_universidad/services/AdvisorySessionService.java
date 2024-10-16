package org.example.gestion_asesorias_universidad.services;

import jakarta.annotation.PostConstruct;
import org.example.gestion_asesorias_universidad.model.*;
import org.springframework.aop.Advisor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdvisorySessionService {
    private final List<AdvisorySession> sessions = new ArrayList<>();




    @PostConstruct
    public void loadDefaultSessions() {
        // Crear estudiantes y asesores predefinidos
        Student alice = new Student("S1", "Alice", "Perea","Ingeniera");
        Student bob = new Student("S2", "Bob","Constructor","Medico");
        Advisory drSmith = new Advisory("A1", "Dr. Smith");
        Advisory profJohnson = new Advisory("A2", "Prof. Johnson");


        // Agregar sesiones predefinidas
        sessions.add(new AcademicAdvisory(
                "AS1", alice, drSmith, LocalDateTime.of(2024, 10, 25, 10, 0)
        ));

        sessions.add(new ProjectAdvisory(
                "AS2", bob, profJohnson, LocalDateTime.of(2024, 10, 27, 14, 0),
                "Intelligent Campus System"
        ));

        sessions.add(new AcademicAdvisory(
                "AS3", bob, drSmith, LocalDateTime.of(2024, 11, 5, 9, 30)
        ));

        System.out.println("Default advisory sessions loaded successfully.");
    }


    public List<AdvisorySession> getAllSessions() {
        return sessions;
    }

    public void addSession(ProjectAdvisory projectAdvisory) {
        sessions.add(projectAdvisory);
    }

    public void addSession(AcademicAdvisory academicAdvisory) {
        sessions.add(academicAdvisory);
    }
}
