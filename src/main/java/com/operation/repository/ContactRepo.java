package com.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.operation.Entities.Contact;

public interface ContactRepo extends JpaRepository<Contact, Long> {
	
}
