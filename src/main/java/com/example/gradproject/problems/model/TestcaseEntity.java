package com.example.gradproject.problems.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "testcases", indexes = {
	@Index(name = "idx_problem_id", columnList = "problem_id")
})
public class TestcaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte id;

    private String input;
    private String output;
    private String explanation;

    @ManyToOne
    @JoinColumn(name = "problem_id", referencedColumnName="id", nullable=false)
    private ProblemEntity problem;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public ProblemEntity getProblem() {
		return problem;
	}

	public void setProblem(ProblemEntity problem) {
		this.problem = problem;
	}

	public byte getId() {
		return id;
	}
}
