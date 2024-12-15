package com.java.findworks.backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.findworks.backend.data.model.CandidateSkill;
import com.java.findworks.backend.repositories.CandidateSkillRepository;

@Service
public class CandidateSkillService {

    private final CandidateSkillRepository candidateSkillRepository;

    public CandidateSkillService(CandidateSkillRepository candidateSkillRepository) {
        this.candidateSkillRepository = candidateSkillRepository;
    }

    public List<CandidateSkill> findSkillsByCandidateId(long candidateId) {
        return candidateSkillRepository.findByIdCanId(candidateId);
    }
}
