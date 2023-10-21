package com.example.gradproject.problems.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ConstraintEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte id;

    private String constraintDescription;

    @ManyToOne
    @JoinColumn(name = "problem_id")
    private ProblemEntity problem;

	public String getConstraintDescription() {
		return constraintDescription;
	}

	public void setConstraintDescription(String constraintDescription) {
		this.constraintDescription = constraintDescription;
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
