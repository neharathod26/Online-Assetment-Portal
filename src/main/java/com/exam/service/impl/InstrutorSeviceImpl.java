package com.exam.service.impl;

import com.exam.model.Instructor;
import com.exam.model.InstructorRole;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.InstructorRepository;
import com.exam.repo.RoleRepository;
import com.exam.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class InstrutorSeviceImpl implements InstructorService {
    @Autowired
    InstructorRepository ir;

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Instructor createInstructor(Instructor instructor, Set<InstructorRole> instructorRoleSet){

        for(InstructorRole ir:instructorRoleSet){
            roleRepository.save(ir.getRole());
        }
        instructor.getInstructorRoles().addAll(instructorRoleSet);
        Instructor local=this.ir.save(instructor);
       return local;
    }
    @Override
    public Instructor getInstructor(String username) {
        return this.ir.findByUsername(username);
    }

    @Override
    public void deleteInstructor(Long userId) {
        this.ir.deleteById(userId);
    }
}
