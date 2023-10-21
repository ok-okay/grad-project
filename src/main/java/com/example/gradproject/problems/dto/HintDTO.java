package com.example.gradproject.problems.dto;

public class HintDTO {
    private byte id;

    private String hintDescription;
    private Long problemId;

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
	public Long getProblemId() {
		return problemId;
	}
	public void setProblemId(Long problemId) {
		this.problemId = problemId;
	}
}
