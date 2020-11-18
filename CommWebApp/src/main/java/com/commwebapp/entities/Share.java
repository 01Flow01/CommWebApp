package com.commwebapp.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Share {

	private ShareId pk;
	private String text;
	
	@EmbeddedId
	public ShareId getPk() {
		return pk;
	}
	public void setPk(ShareId pk) {
		this.pk = pk;
	}
	@Column(length=5000)
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
