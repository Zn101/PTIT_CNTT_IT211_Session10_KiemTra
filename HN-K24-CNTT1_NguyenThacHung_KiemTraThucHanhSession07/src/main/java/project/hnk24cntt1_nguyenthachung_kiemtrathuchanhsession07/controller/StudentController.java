package project.hnk24cntt1_nguyenthachung_kiemtrathuchanhsession07.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.hnk24cntt1_nguyenthachung_kiemtrathuchanhsession07.entity.Student;
import project.hnk24cntt1_nguyenthachung_kiemtrathuchanhsession07.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private StudentService studentService;

    @GetMapping("/api/students")
    public ResponseEntity<List<Student>> getAllStudent() {
        return ResponseEntity.ok(studentService.getAllStudent());
    }

    @GetMapping("/api/students/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping("/api/students")
    public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student) {
        Student createStudent = studentService.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(createStudent);
    }

    @PutMapping("/api/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @Valid @RequestBody Student student) {
        return ResponseEntity.ok(studentService.updateStudent(id, student));
    }

    @DeleteMapping("/api/students/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok("Student deleted");
    }
}
