package com.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.operation.Entities.Lead;

public interface LeadRepo extends JpaRepository<Lead, Long> {
	

}
