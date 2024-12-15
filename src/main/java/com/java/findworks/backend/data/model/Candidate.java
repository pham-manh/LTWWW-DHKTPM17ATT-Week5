package com.java.findworks.backend.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "candidate", schema = "works")
public class Candidate extends User {

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "dob", nullable = false)
    private String dob;

    // Other candidate-specific fields and methods
}