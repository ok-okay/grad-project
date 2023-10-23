package com.example.gradproject.problems.dto;

public class ProblemDTO {
    private Long id;
	private String heading;
    private String question;

    private DifficultyEnum difficulty;
    
    private Long upvotes;
    private Long downvotes;
    
    private Long submissions;
    private Long accepted;
 
	public ProblemDTO(Long id, String heading, String question, DifficultyEnum difficulty, Long upvotes, Long downvotes,
			Long submissions, Long accepted) {
		super();
		this.id = id;
		this.heading = heading;
		this.question = question;
		this.difficulty = difficulty;
		this.upvotes = upvotes;
		this.downvotes = downvotes;
		this.submissions = submissions;
		this.accepted = accepted;
	}
    
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
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
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
