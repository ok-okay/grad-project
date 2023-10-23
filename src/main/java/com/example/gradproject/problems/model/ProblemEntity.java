package com.example.gradproject.problems.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

@Entity
@Table(name = "problems", indexes = {
	@Index(name = "idx_heading", columnList = "heading")
})
public class ProblemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String heading;
    private String question;

    @Enumerated
    private DifficultyEnum difficulty;
    
    private Long upvotes;
    private Long downvotes;
    
    private Long submissions;
    private Long accepted;
    
    public Long getId() {
		return id;
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
