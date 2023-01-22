package com.sunflower.hrportifolio.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunflower.hrportifolio.dto.PhoneDTO;
import com.sunflower.hrportifolio.entities.Phone;
import com.sunflower.hrportifolio.repositories.PhoneRepository;
import com.sunflower.hrportifolio.services.exceptions.ResourceNotFoundException;

@Service
public class PhoneServices {

	@Autowired
	private PhoneRepository phoneRepository;

	public List<PhoneDTO> findAll() {
		List<Phone> phone = phoneRepository.findAll();
		return phone.stream().map(x -> new PhoneDTO(x)).collect(Collectors.toList());
	}

	public PhoneDTO findById(long id) {
		Optional<Phone> phone = phoneRepository.findById(id);
		if (!phone.isPresent()) {
			Optional<PhoneDTO> objDTO = Optional.empty();
			return objDTO.orElseThrow(() -> new ResourceNotFoundException(id));
		} else {
			return phone.stream().map(x -> new PhoneDTO(x)).findAny().get();
		}
	}

}
