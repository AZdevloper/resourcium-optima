package com.example.youcode.domain.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Equipment")
@Access(AccessType.FIELD)
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
