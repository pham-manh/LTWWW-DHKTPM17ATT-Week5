package com.java.findworks.backend.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "job", schema = "works")
public class Job {
    @Id
    @Column(name = "job_id", nullable = false)
    private Long id;

    @Column(name = "job_desc", nullable = false, length = 2000)
    private String jobDesc;

    @Column(name = "job_name", nullable = false)
    private String jobName;

    @Column(name = "salary", nullable = false)
    private String salary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company")
    private Company company;

}