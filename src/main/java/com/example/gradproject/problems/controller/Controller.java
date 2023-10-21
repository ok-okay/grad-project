package com.example.gradproject.problems.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public ResponseEntity<String> helloWorld() {
	String hello = "Hello world";
	return new ResponseEntity<String>(hello , HttpStatus.OK);
	}
}
