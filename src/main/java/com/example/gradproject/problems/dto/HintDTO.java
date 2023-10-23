package com.example.gradproject.problems.dto;

public class HintDTO {
    private byte id;

    private String hintDescription;
    private Long problem_id;

	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public String getHintDescription() {
		return hintDescription;
	}
	public void setHintDescription(String hintDescription) {
		this.hintDescription = hintDescription;
	}
	public Long getProblem_id() {
		return problem_id;
	}
	public void setProblem_id(Long problem_id) {
		this.problem_id = problem_id;
	}
}
