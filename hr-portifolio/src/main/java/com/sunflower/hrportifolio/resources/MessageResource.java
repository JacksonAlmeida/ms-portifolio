package com.sunflower.hrportifolio.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "msg")
public class MessageResource {

	@GetMapping
	public ResponseEntity<String> message (){
		String msg = "Hello world!!!";
		return ResponseEntity.ok().body(msg);
	}
	
}