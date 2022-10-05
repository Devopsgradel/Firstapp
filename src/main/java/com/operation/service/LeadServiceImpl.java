package com.operation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operation.Entities.Lead;
import com.operation.repository.LeadRepo;
@Service
public class LeadServiceImpl implements LeadService {

	
	@Autowired
	private LeadRepo repo;
	
	@Override
	public void saveoneLead(Lead lead) {
    repo.save(lead);
	}

	@Override
	public Lead getoneleadbyid(long id) {
     Optional<Lead> findbyid = repo.findById(id);
     Lead lead = findbyid.get();
		return lead;
	}

	@Override
	public void deleteoneid(long id) {
		repo.deleteById(id);
	}

	@Override
	public List<Lead> listleads() {
List<Lead> lead = repo.findAll();
		
		return lead;
	}

	

}
