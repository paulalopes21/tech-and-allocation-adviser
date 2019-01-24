package com.pls.techandallocationadviser.model.response;

import com.pls.techandallocationadviser.model.Techs;

public class TechResponse {
	private Long idAdviser;
	private String name;
	private String about;
	private String phone;
	private String email;
	private Techs techs;
	private boolean available;
	public Long getIdAdviser() {
		return idAdviser;
	}
	public void setIdAdviser(Long idAdviser) {
		this.idAdviser = idAdviser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Techs getTechs() {
		return techs;
	}
	public void setTechs(Techs techs) {
		this.techs = techs;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public TechResponse(String name, String about, String phone, String email, Techs techs, boolean available) {
		super();
		this.name = name;
		this.about = about;
		this.phone = phone;
		this.email = email;
		this.techs = techs;
		this.available = available;
	}
	public TechResponse() {
		super();
	}
	
	
	

}
