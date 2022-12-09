package com.exam.model;

import javax.persistence.*;

public class AdminRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminRoleId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Admin admin;

    @ManyToOne
    private Role role;


}
