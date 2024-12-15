package com.java.findworks.backend.repositories;

import com.java.findworks.backend.data.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
