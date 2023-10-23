package com.example.gradproject.problems.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
