package com.exam.controller;

import com.exam.model.*;
import com.exam.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/instructor")
@CrossOrigin("*")
public class InstructorController {
    @Autowired
    InstructorService instructorService;
    Set<UserRole> roles=new HashSet<>();
    @PostMapping("/addInstructor")
    public Instructor createInstructor(@RequestBody Instructor instructor) throws Exception {
        Set<InstructorRole> roles=new HashSet<>();
        Role role = new Role();
        role.setRoleId(50L);
        role.setRoleName("Instructor");

        InstructorRole instructorRole = new InstructorRole();
       instructorRole.setInstructor(instructor);
        instructorRole.setRole(role);
        roles.add(instructorRole);
        return this.instructorService.createInstructor(instructor, roles);
    }
}

