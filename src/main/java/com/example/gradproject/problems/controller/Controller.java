package com.example.gradproject.problems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gradproject.problems.service.ProblemService;


@RestController
@RequestMapping("/problems")
public class Controller {
	//	https://odrotbohm.de/2013/11/why-field-injection-is-evil/
	private final ProblemService problemService;

    @Autowired
    public Controller(ProblemService problemService){
        this.problemService = problemService;
    }
	
	@GetMapping("/{url}/description")
	public ResponseEntity<String> getProblemDescription(@PathVariable String url) {
		problemService.getProblemDescription(url);
		return new ResponseEntity<>(url , HttpStatus.OK);
	}
}
