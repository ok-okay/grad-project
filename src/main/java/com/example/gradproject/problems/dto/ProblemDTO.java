package com.example.gradproject.problems.dto;

public class ProblemDTO {
    private Long id;
	private String heading;
    private String description;

    private DifficultyEnum difficulty;
    
    private Long upvotes;
    private Long downvotes;
    
    private Long submissions;
    private Long accepted;
 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public DifficultyEnum getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(DifficultyEnum difficulty) {
		this.difficulty = difficulty;
	}
	public Long getUpvotes() {
		return upvotes;
	}
	public void setUpvotes(Long upvotes) {
		this.upvotes = upvotes;
	}
	public Long getDownvotes() {
		return downvotes;
	}
	public void setDownvotes(Long downvotes) {
		this.downvotes = downvotes;
	}
	public Long getSubmissions() {
		return submissions;
	}
	public void setSubmissions(Long submissions) {
		this.submissions = submissions;
	}
	public Long getAccepted() {
		return accepted;
	}
	public void setAccepted(Long accepted) {
		this.accepted = accepted;
	}
}
