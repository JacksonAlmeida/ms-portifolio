package com.sunflower.hrportifolio.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/hr-phone/configs")
public class MessageResource {
	
	@Value("${test.config}")
	private String testConfig;
	
	@GetMapping
	public ResponseEntity<String> message (){
		String msg = testConfig;
		return ResponseEntity.ok().body(msg);
	}
	
}