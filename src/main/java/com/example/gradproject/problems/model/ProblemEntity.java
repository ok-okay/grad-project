package com.example.gradproject.problems.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Index;

@Entity
@Table(name = "problem", indexes = {
	@Index(name = "idx_heading", columnList = "heading")
})

public class ProblemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String heading;
    private String description;

    @Enumerated(EnumType.STRING)
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
