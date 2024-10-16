package org.example.gestion_asesorias_universidad.controller;

import org.example.gestion_asesorias_universidad.model.AcademicAdvisory;
import org.example.gestion_asesorias_universidad.model.AdvisorySession;
import org.example.gestion_asesorias_universidad.model.ProjectAdvisory;
import org.example.gestion_asesorias_universidad.services.AdvisorySessionService;
import org.example.gestion_asesorias_universidad.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/advisors")
public class AdvisorySessionController {
    private final AdvisorySessionService sessionService;
    private final StudentService studentService;

    // Constructor para inyectar el servicio
    public AdvisorySessionController(AdvisorySessionService sessionService, StudentService studentService) {
        this.sessionService = sessionService;
        this.studentService = studentService;
    }

    // GET /api/advisors/sessions -> Listar todas las sesiones
    @GetMapping("/sessions")
    public List<AdvisorySession> getAllSessions() {
        return sessionService.getAllSessions();
    }
/*
    @PostMapping("/addproject")
    public ResponseEntity<String> createSession(@RequestBody ProjectAdvisory projectAdvisory) {
        sessionService.addSession(projectAdvisory);
        return new ResponseEntity<>("Session of project created successfully.", HttpStatus.CREATED);
    }*/

    @PostMapping("/addproject")
    public ResponseEntity<String> createProjectSession(@RequestBody ProjectAdvisory request) {
        // Agregar el estudiante a la lista si no existe
        studentService.addStudent(request.getStudent());

        // Crear la sesión de asesoría
        ProjectAdvisory session = new ProjectAdvisory(
                UUID.randomUUID().toString(),  // Generar un ID único
                request.getStudent(),
                request.getAdvisory(),
                request.getDateTime(),
                request.getProjectName()
        );


        sessionService.addSession( session);
        return new ResponseEntity<>("Session of project created successfully.", HttpStatus.CREATED);
    }

    /*@PostMapping("/addacademic")
    public ResponseEntity<String> createSession(@RequestBody AcademicAdvisory academicAdvisory) {
        sessionService.addSession(academicAdvisory);
        return new ResponseEntity<>("Session academic created successfully.", HttpStatus.CREATED);
    }*/

    // POST /api/university/advisors/sessions -> Crear una nueva asesoría con estudiante
    @PostMapping("/addacademic")
    public ResponseEntity<String> createAcademicSession(@RequestBody AcademicAdvisory request) {
        // Agregar el estudiante a la lista si no existe
        studentService.addStudent(request.getStudent());

        // Crear la sesión de asesoría
        AcademicAdvisory session = new AcademicAdvisory(
                UUID.randomUUID().toString(),  // Generar un ID único
                request.getStudent(),
                request.getAdvisory(),
                request.getDateTime()
        );

        sessionService.addSession( session);
        return new ResponseEntity<>("Session academic created successfully.", HttpStatus.CREATED);
    }


}
