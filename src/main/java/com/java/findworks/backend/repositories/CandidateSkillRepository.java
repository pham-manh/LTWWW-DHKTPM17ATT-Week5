package com.java.findworks.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.findworks.backend.data.model.CandidateSkill;
import com.java.findworks.backend.data.model.CandidateSkillId;

@Repository
public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillId> {

    List<CandidateSkill> findByIdCanId(Long id_canId);
}
