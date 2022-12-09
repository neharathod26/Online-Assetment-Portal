package com.exam.model;

import javax.persistence.*;

@Entity
public class InstructorRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long instructorRoleId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Instructor instructor;

    @ManyToOne
    private Role role;

    public InstructorRole() {
    }

    public InstructorRole(Long instructorRoleId, Instructor instructor, Role role) {
        this.instructorRoleId = instructorRoleId;
        this.instructor = instructor;
        this.role = role;
    }

    public Long getInstructorRoleId() {
        return instructorRoleId;
    }

    public void setInstructorRoleId(Long instructorRoleId) {
        this.instructorRoleId = instructorRoleId;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
