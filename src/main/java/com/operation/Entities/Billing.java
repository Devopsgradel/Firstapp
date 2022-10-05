package com.operation.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Billing")
public class Billing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Column(name="firast_name" ,nullable=false ,length=45)
private String firstname;
	@Column(name="last_name" ,nullable=false ,length=45)
private String lastname;

	@Column(name="email" ,nullable=false ,length=128,unique=true)
private String email;
	@Column(name="mobile" ,nullable=false ,length=10,unique=true)
private long mobile;
	@Column(name="Product",nullable=false)
	private String Product;
	@Column(name="amount",nullable=false)
	private int amount;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getProduct() {
	return Product;
}
public void setProduct(String product) {
	Product = product;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

}
