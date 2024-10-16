package org.example.gestion_asesorias_universidad.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class Student {
    @Getter
    private String id;
    @Getter
    private String name;
    @Getter
    private String lastName;
    @Getter
    private String career;




}


