package com.cooplandteam.sm.services;

import com.cooplandteam.sm.api.Student;
import com.cooplandteam.sm.api.StudentDTO;

import java.util.List;

public interface StudentService {

    public void saveStudent(StudentDTO studentDTO);
    public List<Student> listAllStudents();
    public StudentDTO getSingleStudent(int id);
    public void updateStudent(int id, StudentDTO studentDTO);
    public void deleteStudent(int id);
}
