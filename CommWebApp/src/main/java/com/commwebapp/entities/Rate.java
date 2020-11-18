package com.commwebapp.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Rate {

	private RateId pk;
	private Boolean proRate;
	
	@EmbeddedId
	public RateId getPk() {
		return pk;
	}
	public void setPk(RateId pk) {
		this.pk = pk;
	}
	public Boolean getProRate() {
		return proRate;
	}
	public void setProRate(Boolean proRate) {
		this.proRate = proRate;
	}
	
	
}
