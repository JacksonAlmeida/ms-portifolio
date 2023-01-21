package com.sunflower.hrportifolio.dto;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

public class PhoneDTO extends RepresentationModel<PhoneDTO> implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String number;
	
	public PhoneDTO() {
		
	}

	public PhoneDTO(Long id, String number) {
		this.id = id;
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
