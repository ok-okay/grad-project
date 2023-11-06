package com.example.gradproject.problems.dto;

public class ConstraintDTO {
	private byte id;

    private String constraintDescription;
    private Long problem_id;

	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public String getConstraintDescription() {
		return constraintDescription;
	}
	public void setConstraintDescription(String constraintDescription) {
		this.constraintDescription = constraintDescription;
	}
	public Long getProblem_id() {
		return problem_id;
	}
	public void setProblem_id(Long problem_id) {
		this.problem_id = problem_id;
	}
}
