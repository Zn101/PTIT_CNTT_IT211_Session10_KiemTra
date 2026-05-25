package project.hnk24cntt1_nguyenthachung_kiemtrathuchanhsession07.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.hnk24cntt1_nguyenthachung_kiemtrathuchanhsession07.entity.Student;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudent();
    Student getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
