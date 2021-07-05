package com.cooplandteam.sm.mapper;

import com.cooplandteam.sm.api.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {

        Student student = new Student();

        student.setId(resultSet.getInt("id"));
        student.setCountry(resultSet.getString("country"));
        student.setName(resultSet.getString("name"));
        student.setMobile(resultSet.getLong("mobile"));

        return student;
    }
}
