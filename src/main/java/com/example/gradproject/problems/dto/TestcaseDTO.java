package com.example.gradproject.problems.dto;

public class TestcaseDTO {
    private byte id;

    private String input;
    private String output;
    private String explanation;
    private Long problem_id;

	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
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
	public Long getProblem_id() {
		return problem_id;
	}
	public void setProblem_id(Long problem_id) {
		this.problem_id = problem_id;
	}

}
