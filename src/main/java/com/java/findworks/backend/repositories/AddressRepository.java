package com.java.findworks.backend.repositories;

import com.java.findworks.backend.data.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
