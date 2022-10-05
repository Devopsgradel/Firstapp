package com.operation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operation.Entities.Billing;
import com.operation.repository.BillingRepo;

@Service
public class BillServiceImpl implements BillService {
@Autowired
BillingRepo repo;
	@Override
	public void savebill(Billing bill) {
		repo.save(bill);
	}

}
