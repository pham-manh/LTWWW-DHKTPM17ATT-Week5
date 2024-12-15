package com.java.findworks.backend.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "company", schema = "works")
public class Company extends User {

    @Column(name = "about", length = 2000)
    private String about;

    @Column(name = "comp_name", nullable = false)
    private String compName;

    @Column(name = "web_url")
    private String webUrl;

    // Other company-specific fields and methods
}