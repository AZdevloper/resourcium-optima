package com.example.youcode.domain.entities;

//import ;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Deppartment")
@Access(AccessType.FIELD) //
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mangerId", referencedColumnName = "id")
    private Employee manager;

    @OneToMany(mappedBy="Department")
    private Set<Employee> employeesList;


}
