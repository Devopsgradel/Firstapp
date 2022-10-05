package com.operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.operation.Entities.Contact;
import com.operation.Entities.Lead;
import com.operation.service.ContactService;
import com.operation.service.LeadService;

@Controller
public class LeadController {

	@Autowired
    private LeadService service;
	
	@Autowired
	private ContactService cs;

	@RequestMapping("/")
	public String viewCreateLeadPage() {
		return "create_lead";
		
	}
	@RequestMapping("/please_save")
	public String saveonelead(@ModelAttribute("lead")Lead lead,ModelMap model) {
		service.saveoneLead(lead);
		model.addAttribute("lead", lead);
		return"Lead_info";
		
	}
	@RequestMapping("/convertdata")
	public String convertlead(@RequestParam("id")long id , ModelMap Model) {
		Lead lead = service.getoneleadbyid(id);
		Contact contact=new Contact();
		contact.setFirstname(lead.getFirstname());
		contact.setLastname(lead.getLastname());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		
		cs.saveonecontact(contact);
		service.deleteoneid(id);
		
		List<Contact> contacts = cs.listcontact();
		Model.addAttribute("contact", contacts);
		return "listallcontact";
	}
	@RequestMapping("/list")
	public String listall(ModelMap Model) {
	 List<Lead> lead = service.listleads();
		Model.addAttribute("vasanth",  lead);
		return "listall";
		
	}
	
	@RequestMapping("/Leadinfo")
        public String leadinfo(@RequestParam("id")long id,ModelMap Model) {
	Lead lead = service.getoneleadbyid(id);
	Model.addAttribute("lead", lead);
	
		return "Lead_info";
		
	}
}
