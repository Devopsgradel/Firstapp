package com.operation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operation.Entities.Contact;
import com.operation.repository.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepo contactrepo;
	
	@Override
	public void saveonecontact(Contact contact) {
		contactrepo.save(contact);
	}

	@Override
	public List<Contact> listcontact() {
List<Contact> contacts = contactrepo.findAll();
		return contacts;
	}

	@Override
	public Contact getonecontact(long id) {
		Optional<Contact> findByid = contactrepo.findById(id);
		 Contact contact = findByid.get();
		return contact; 
	}

	

}
