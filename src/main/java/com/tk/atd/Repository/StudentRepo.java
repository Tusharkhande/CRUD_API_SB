package com.tk.atd.Repository;

import com.tk.atd.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    public Student findById(int id);
}
