package com.sunflower.hrportifolio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunflower.hrportifolio.dto.PhoneDTO;
import com.sunflower.hrportifolio.services.PhoneServices;

@RestController
@RequestMapping(value = "api/hr-phone/phones")
public class PhoneResource {

	@Autowired
	private PhoneServices phoneServices;

	@GetMapping
	public ResponseEntity<List<PhoneDTO>> findAll() {
		List<PhoneDTO> list = phoneServices.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<PhoneDTO> findById(@PathVariable long id) {
		PhoneDTO obj = phoneServices.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}