package com.cooplandteam.sm.dao;

import com.cooplandteam.sm.api.Student;
import com.cooplandteam.sm.api.StudentDTO;
import com.cooplandteam.sm.mapper.StudentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> loadStudents() {

        String sql = "SELECT * FROM students";

        List<Student> getAllStudents = jdbcTemplate.query(sql, new StudentRowMapper());

        return getAllStudents;
    }

    @Override
    public void saveStudent(StudentDTO studentDTO) {
        String sql = "INSERT INTO students(name, mobile, country) values(?,?,?)";
        Object[] queryParameters = {studentDTO.getName(), studentDTO.getMobile(), studentDTO.getCountry()};

        jdbcTemplate.update(sql, queryParameters);
    }

    @Override
    public StudentDTO getSingleStudent(int id) {

        String sql = "SELECT * from students WHERE id = ?";

        Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setName(student.getName());
        studentDTO.setCountry(student.getCountry());
        studentDTO.setMobile(student.getMobile());
        studentDTO.setId(student.getId());

        return studentDTO;
    }

    @Override
    public void updateStudent(int id, StudentDTO studentDTO) {

        String query = "UPDATE students set name=?, country=?, mobile=? WHERE id=?";
        Object[] queryParams = {studentDTO.getName(), studentDTO.getCountry(), studentDTO.getMobile(), id};

        jdbcTemplate.update(query, queryParams);

    }

    @Override
    public void deleteStudent(int id) {

        String query = "DELETE FROM students WHERE id=?";

        jdbcTemplate.update(query, id);

    }


}
