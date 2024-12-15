package com.java.findworks.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.java.findworks.backend.data.model.Candidate;
import com.java.findworks.backend.repositories.CandidateRepository;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public List<Candidate> findAllCandidates() {
        return candidateRepository.findAll();
    }

    public Optional<Candidate> findCandidateById(long id) {
        return candidateRepository.findById(id);
    }

    public void saveCandidate(Candidate candidate) {
        candidateRepository.save(candidate);
    }
}
