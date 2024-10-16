package org.example.gestion_asesorias_universidad.services;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.gestion_asesorias_universidad.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {

    private final List<Student > studentList = new ArrayList<>();


            public StudentService() {

                //Agregar estudiantes

                studentList.add(new Student("A1","jose","cardenas","ingenieria"));
                studentList.add(new Student("A2","Pedro","Restrepo","Fisica"));


            }



            // Agregar un estudiante a la lista
            public void addStudent(Student student) {
                studentList.add(student);
            }

            public List<Student> getAllStudents() {
                return studentList;
            }
}
