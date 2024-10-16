package org.example.gestion_asesorias_universidad.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.gestion_asesorias_universidad.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {

    private final List<Student > studentList = new ArrayList<>();


            public StudentService() {
                studentList.add(new Student("A1","jose","cardenas","ingenieria"));
                studentList.add(new Student("A2","Pedro","Restrepo","Fisica"));
            }




}
