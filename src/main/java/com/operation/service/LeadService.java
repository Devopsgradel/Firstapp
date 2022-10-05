package com.operation.service;

import java.util.List;

import com.operation.Entities.Lead;

public interface LeadService {

	public void saveoneLead(Lead lead);

	public Lead getoneleadbyid(long id);

	public void deleteoneid(long id);

	public List<Lead> listleads();

}
