package com.tk.atd.service;

import com.tk.atd.Model.Student;
import com.tk.atd.Repository.StudentRepo;
import com.tk.atd.dto.StudentRequest;
import com.tk.atd.dto.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<StudentResponse> getStudents() {
        List<StudentResponse> students = new ArrayList<>();
        studentRepo.findAll().forEach(student -> {
            StudentResponse student1 = new StudentResponse();
            student1.setId(student.getId());
            student1.setName(student.getName());
            student1.setEmail(student.getEmail());
            student1.setPhone(student.getPhone());
            students.add(student1);
        });
        return students;
    }

    public void createStudent(StudentRequest student) {
        Student student1 = new Student();
        student1.setName(student.getName());
        student1.setEmail(student.getEmail());
        student1.setPhone(student.getPhone());
        studentRepo.save(student1);
    }

    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }

    public void updateStudent(int id, StudentRequest student) {
        Student student1 = studentRepo.findById(id);
        student1.setName(student.getName());
        student1.setEmail(student.getEmail());
        student1.setPhone(student.getPhone());
        studentRepo.save(student1);
    }

    public StudentResponse getStudentById(int id) {
        Student student = studentRepo.findById(id);
        StudentResponse student1 = new StudentResponse();
        student1.setId(student.getId());
        student1.setName(student.getName());
        student1.setEmail(student.getEmail());
        student1.setPhone(student.getPhone());
        return student1;
    }
}
