package org.example.gestion_asesorias_universidad.controller;

import org.example.gestion_asesorias_universidad.model.Advisory;
import org.example.gestion_asesorias_universidad.model.AdvisorySession;
import org.example.gestion_asesorias_universidad.services.AdvisorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/advisors")
public class AdvisorController {
    private final AdvisorService advisorService;



    public AdvisorController(AdvisorService advisorService) {
        this.advisorService = advisorService;
    }

    //Endpoint para listar todos los asesores
    @GetMapping
    public List<Advisory> getAllAdvisors() {
        return advisorService.getAllAdvisors();
    }



   /* //Endpoint para agregar una sesion de asesoria
    @PostMapping("/addsession")
    public String addSession(@RequestBody AdvisorySession session) {
        advisorService.addSession(session);
        return "Asesoria añadida satisfactoriamente";
    }

    //Endpoint para listar todas las sesiones
    @GetMapping("/sessions")
    public List<AdvisorySession> getAllSessions() {
        return advisorService.getAllSessions();
    }*/
}
