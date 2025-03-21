package com.sarthak.classroomproject.student;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    private final JdbcClient jdbcClient;

    public StudentRepository(JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }

    List<StudentModel> getAllStudents(){
        return jdbcClient.sql("SELECT * FROM student;").query(StudentModel.class).list();
    }








}
