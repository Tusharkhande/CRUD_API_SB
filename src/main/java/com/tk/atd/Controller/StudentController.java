package com.tk.atd.Controller;

import com.tk.atd.dto.StudentRequest;
import com.tk.atd.dto.StudentResponse;
import com.tk.atd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentResponse> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StudentResponse getStudent(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createStudent(@RequestBody StudentRequest student) {
        studentService.createStudent(student);
        return "User Created Successfully";
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "User Deleted Successfully";
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String updateStudent(@PathVariable int id, @RequestBody StudentRequest student) {
        studentService.updateStudent(id, student);
        return "User Updated Successfully";
    }

}
