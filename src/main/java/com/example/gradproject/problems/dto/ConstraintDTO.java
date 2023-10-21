package com.example.gradproject.problems.dto;

public class ConstraintDTO {
    private byte id;

    private String constraintDescription;
    private Long problemId;

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
	public Long getProblemId() {
		return problemId;
	}
	public void setProblemId(Long problemId) {
		this.problemId = problemId;
	}
}
