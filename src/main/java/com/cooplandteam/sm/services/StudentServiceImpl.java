package com.cooplandteam.sm.services;

import com.cooplandteam.sm.api.Student;
import com.cooplandteam.sm.api.StudentDTO;
import com.cooplandteam.sm.dao.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDAO studentDAO;

    @Override
    public void saveStudent(StudentDTO studentDTO) {
        studentDAO.saveStudent(studentDTO);
    }

    @Override
    public List<Student> listAllStudents() {
        return studentDAO.loadStudents();
    }

    @Override
    public StudentDTO getSingleStudent(int id) {
        return studentDAO.getSingleStudent(id);
    }

    @Override
    public void updateStudent(int id, StudentDTO studentDTO) {
        studentDAO.updateStudent(id, studentDTO);
    }

    @Override
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }
}
