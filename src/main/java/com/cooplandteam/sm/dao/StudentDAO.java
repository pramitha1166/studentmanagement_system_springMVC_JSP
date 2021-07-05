package com.cooplandteam.sm.dao;

import com.cooplandteam.sm.api.Student;
import com.cooplandteam.sm.api.StudentDTO;

import java.util.List;

public interface StudentDAO {

    public List<Student> loadStudents();

    public void saveStudent(StudentDTO studentDTO);

    public StudentDTO getSingleStudent(int id);

    public void updateStudent(int id, StudentDTO studentDTO);

    public void deleteStudent(int id);
}
