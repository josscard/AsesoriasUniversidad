package org.example.gestion_asesorias_universidad.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data
public class Student {

    private String id;
    private String name;
    private String lastName;
    private String career;

    public Student(String id, String name, String lastName, String career) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.career = career;
    }

    public Student() {
    }

}


