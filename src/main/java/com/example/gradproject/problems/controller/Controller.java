package com.example.gradproject.problems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gradproject.problems.model.ProblemEntity;
import com.example.gradproject.problems.repository.ProblemRepository;

@RestController
@RequestMapping("/problems")
public class Controller {
	
	@Autowired
	ProblemRepository problemRepo;
	
	@GetMapping("/{heading}/description")
	public ResponseEntity<String> getProblemDescription(@PathVariable String heading) {
		return new ResponseEntity<>(heading , HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<ProblemEntity> createProblem(@RequestBody ProblemEntity problem){
		return ResponseEntity.ok(problemRepo.save(problem));
	}
}
