package com.java.findworks.backend.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.java.findworks.backend.data.model.Job;
import com.java.findworks.backend.repositories.JobRepository;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public Page<Job> findPaginated(int page, int size) {
        return jobRepository.findAll(PageRequest.of(page, size));
    }

    public Optional<Job> findById(Long id) {
        return jobRepository.findById(id);
    }
}
