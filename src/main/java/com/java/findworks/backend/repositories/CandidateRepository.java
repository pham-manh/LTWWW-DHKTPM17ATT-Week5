package com.java.findworks.backend.repositories;

import com.java.findworks.backend.data.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
