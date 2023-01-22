package com.sunflower.hrportifolio.dto;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

import com.sunflower.hrportifolio.entities.Phone;

public class PhoneDTO extends RepresentationModel<PhoneDTO> implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String number;
	
	public PhoneDTO() {
		
	}

	public PhoneDTO(Phone x) {
		id = x.getId();
		number = x.getNumber();
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
