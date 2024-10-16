package org.example.gestion_asesorias_universidad.controller;

import org.example.gestion_asesorias_universidad.model.Student;
import org.example.gestion_asesorias_universidad.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Endpoint para listar todos los estudiantes

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.getAllStudents().add(student);
        return "Estudiante adicionado exitosamente";
    }
}
