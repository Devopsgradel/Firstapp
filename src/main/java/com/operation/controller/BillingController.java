package com.operation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.operation.Entities.Billing;
import com.operation.Entities.Contact;
import com.operation.service.BillService;
import com.operation.service.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private BillService billing;
	
	@Autowired
	private ContactService contact;
	
	@RequestMapping("/billinginfo")
     public String showbill(@RequestParam("id") long id,ModelMap model) {
	Contact contact2 = contact.getonecontact(id);
	model.addAttribute("contact",contact2);
	return "Generatebill";
	
}
	
	@RequestMapping("/Generatebills")
	public String Generatebill(@ModelAttribute("bill")Billing bill,ModelMap model) {
		billing.savebill(bill);
		model.addAttribute("bill",bill);
		return "billingdone";
		
	}
}
