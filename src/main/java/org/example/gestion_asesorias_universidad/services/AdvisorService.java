package org.example.gestion_asesorias_universidad.services;


import org.example.gestion_asesorias_universidad.model.Advisory;
import org.example.gestion_asesorias_universidad.model.AdvisorySession;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdvisorService {
    private final List<Advisory> advisors = new ArrayList<>();
    private final List<AdvisorySession> sessions = new ArrayList<>();

    public AdvisorService() {
        // agrega a algunos asesores iniciales
        advisors.add(new Advisory(1, "Profe Carlos Loaiza"));
        advisors.add(new Advisory(2, "Alberto Restrepo"));

        };

   public List<Advisory> getAllAdvisors() {
       return advisors;
   }
   public List<AdvisorySession> getAllSessions() {
       return sessions;
   }
   public void addSession(AdvisorySession session) {
       sessions.add(session);
   }


    }

