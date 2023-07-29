package com.example.spingjpa.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> index() {
        return studentService.getStudents();
    }

    @PostMapping
    public void store(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping(path = "{id}")
    public void destroy(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Student student) {
        studentService.updateStudent(id, student);
    }
}
