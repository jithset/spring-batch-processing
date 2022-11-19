package com.github.jithset.batchprocessing.config;

import com.github.jithset.batchprocessing.entity.Student;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StudentResultRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int i) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("customer_id"));
        student.setRoll_number(rs.getString("contact"));
        student.setName(rs.getString("country"));
        return student;
    }
}