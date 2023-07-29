package com.example.spingjpa.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if (studentByEmail.isPresent()) {
            throw new IllegalStateException("Email already taken.");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        boolean studentExist = studentRepository.existsById(id);
        if (!studentExist) {
            throw new IllegalStateException("Student id: " + id + ", not found");
        }
        studentRepository.deleteById(id);
    }

    @Transactional
    public void updateStudent(Long id, Student student) {
        Student studentById = studentRepository.findById(id).orElseThrow(() -> new IllegalStateException("Student id: " + id + ", not found"));

        if (!student.getName().isEmpty() && student.getName().length() > 0 && !Objects.equals(studentById.getName(), student.getName())) {
            studentById.setName(student.getName());
        }

        if (!student.getEmail().isEmpty() && student.getEmail().length() > 0 && !Objects.equals(studentById.getEmail(), student.getEmail())) {
            Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
            if (studentByEmail.isPresent()) {
                throw new IllegalStateException("Student id: " + id + ", not found");
            }
            studentById.setEmail(student.getEmail());
        }

        studentRepository.save(studentById);
    }
}
