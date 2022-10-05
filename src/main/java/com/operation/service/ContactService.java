package com.operation.service;

import java.util.List;

import com.operation.Entities.Contact;

public interface ContactService {
public void saveonecontact(Contact contact);
public List<Contact>listcontact();
public Contact getonecontact(long id);
}
