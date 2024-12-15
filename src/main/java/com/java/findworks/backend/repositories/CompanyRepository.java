package com.java.findworks.backend.repositories;

import com.java.findworks.backend.data.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
