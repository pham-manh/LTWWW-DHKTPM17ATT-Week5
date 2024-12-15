package com.java.findworks.backend.repositories;

import com.java.findworks.backend.data.model.JobSkill;
import com.java.findworks.backend.data.model.JobSkillId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillId> {
}