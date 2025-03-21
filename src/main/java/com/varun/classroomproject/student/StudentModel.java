package com.varun.classroomproject.student;

public record StudentModel(
        Integer id,
        String name,
        String email,
        String phoneNumber,
        String branch
) {
}
