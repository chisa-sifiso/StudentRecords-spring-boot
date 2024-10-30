package tut.StudentApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tut.StudentApp.model.Student;
import tut.StudentApp.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @Operation(summary = "Retrieve all students")
    @GetMapping
    public List<Student> getAllStudents() {
        return service.findAll();
    }

    @Operation(summary = "Add a new student")
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.save(student);
    }

    @Operation(summary = "Delete a student by ID")
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteById(id);
    }
}