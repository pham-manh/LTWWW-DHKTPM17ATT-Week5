package com.java.findworks.backend.repositories;

import com.java.findworks.backend.data.model.Job;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface JobRepository extends PagingAndSortingRepository<Job, Long> {
    Optional<Job> findById(Long id);
}
