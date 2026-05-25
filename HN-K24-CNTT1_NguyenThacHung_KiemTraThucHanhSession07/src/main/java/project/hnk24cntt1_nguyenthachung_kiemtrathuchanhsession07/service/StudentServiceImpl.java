package project.hnk24cntt1_nguyenthachung_kiemtrathuchanhsession07.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.hnk24cntt1_nguyenthachung_kiemtrathuchanhsession07.entity.Student;
import project.hnk24cntt1_nguyenthachung_kiemtrathuchanhsession07.repository.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    public StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student existStudent = getStudentById(id);
        existStudent.setEmail(student.getEmail());
        existStudent.setGpa(student.getGpa());
        existStudent.setFullName(student.getFullName());
        return studentRepository.save(existStudent);
    }

    @Override
    public void deleteStudent(Long id) {
        Student existStudent = getStudentById(id);
        studentRepository.delete(existStudent);
    }
}
