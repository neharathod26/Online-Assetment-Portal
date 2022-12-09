package com.exam.service;

import com.exam.model.Instructor;
import com.exam.model.InstructorRole;
import com.exam.model.User;
import com.exam.model.UserRole;

import java.util.Set;

public interface InstructorService {


    Instructor createInstructor(Instructor inst, Set<InstructorRole> instructorRoles);

   Instructor getInstructor(String username);

    void deleteInstructor(Long instructorId);
}
