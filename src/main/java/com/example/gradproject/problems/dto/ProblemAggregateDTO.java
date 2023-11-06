package com.example.gradproject.problems.dto;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;


public class ProblemAggregateDTO {
	private ProblemDTO problem;
	private ArrayList<HintDTO> hints;
	private ArrayList<ConstraintDTO> constraints;
	private ArrayList<TestcaseDTO> testcases;

	public ProblemDTO getProblem() {
		return problem;
	}
	public void setProblem(ProblemDTO problem) {
		this.problem = problem;
	}
	public ArrayList<HintDTO> getHints() {
		return hints;
	}
	public void setHints(ArrayList<HintDTO> hints) {
		this.hints = hints;
	}
	public ArrayList<ConstraintDTO> getConstraints() {
		return constraints;
	}
	public void setConstraints(ArrayList<ConstraintDTO> constraints) {
		this.constraints = constraints;
	}
	public ArrayList<TestcaseDTO> getTestcases() {
		return testcases;
	}
	public void setTestcases(ArrayList<TestcaseDTO> testcases) {
		this.testcases = testcases;
	}
}
