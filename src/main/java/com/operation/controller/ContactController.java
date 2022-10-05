package com.operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.operation.Entities.Contact;
import com.operation.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService cs;
	
	@RequestMapping("/listcontact")
	public String listcontact(ModelMap Model) {
		List<Contact> contacts = cs.listcontact();
		Model.addAttribute("contact", contacts);
		return "listallcontact";
		
	}
	
	@RequestMapping("/contactinfo")
	public String contactinfo(@RequestParam("id") long id , ModelMap Model) {
		Contact contact = cs.getonecontact(id);
		Model.addAttribute("contact", contact);
		return "coninfo";
		
	}

}
