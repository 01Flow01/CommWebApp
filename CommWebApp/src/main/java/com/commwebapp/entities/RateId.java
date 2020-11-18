package com.commwebapp.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class RateId implements Serializable{

	
	private static final long serialVersionUID = -1265009437139299564L;
private User user;
private Product product;
	
	@ManyToOne
public User getUser() {
		return user;
	}
public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToOne
public Product getProduct() {
		return product;
	}
public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
