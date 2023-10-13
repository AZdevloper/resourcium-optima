package com.example.youcode.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
@Access(AccessType.FIELD)

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;





}
