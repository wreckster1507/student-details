package com.sarthak.classroomproject.student;

public record StudentModel(
        Integer id,
        String name,
        String email,
        String phoneNumber,
        String branch
) {
}
