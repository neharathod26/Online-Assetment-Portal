package com.exam.repo;

import com.exam.model.Instructor;
import com.exam.model.Role;
import com.exam.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    public Instructor findByUsername(String username);
}
