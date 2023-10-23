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
@Table(name = "constraints", indexes = {
	@Index(name = "idx_problem_id", columnList = "problem_id")
})
public class ConstraintEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte id;

    private String constraintDescription;

    @ManyToOne
    @JoinColumn(name = "problem_id", referencedColumnName="id", nullable=false)
    private ProblemEntity problem;

	public String getConstraintDescription() {
		return constraintDescription;
	}

	public void setConstraintDescription(String constraintDescription) {
		this.constraintDescription = constraintDescription;
	}
//
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
