package com.example.gradproject.problems.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "hints", indexes = {
	@Index(name = "idx_problem_id", columnList = "problem_id")
})
public class HintEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte id;

    private String hintDescription;

    @ManyToOne
    @JoinColumn(name = "problem_id", referencedColumnName="id", nullable=false)
    private ProblemEntity problem;

	public String getHintDescription() {
		return hintDescription;
	}

	public void setHintDescription(String hintDescription) {
		this.hintDescription = hintDescription;
	}

	public ProblemEntity getProblem() {
		return problem;
	}

	public void setProblem(ProblemEntity problem) {
		this.problem = problem;
	}

	public byte getId() {
		return id;
	}
}
