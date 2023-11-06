package com.example.gradproject.problems.model;

public class ProblemAggregateEntity {
	private ProblemEntity problemEntity;
	private HintEntity hintEntity;
	private ConstraintEntity constraintEntity;
	private TestcaseEntity testcaseEntity;
	
	public ProblemAggregateEntity (
			ProblemEntity problemEntity, HintEntity hintEntity,
			ConstraintEntity constraintEntity, TestcaseEntity testcaseEntity
			) {
		this.problemEntity = problemEntity;
		this.hintEntity = hintEntity;
		this.constraintEntity = constraintEntity;
		this.testcaseEntity = testcaseEntity;
	}

	public ProblemEntity getProblemEntity() {
		return problemEntity;
	}

	public void setProblemEntity(ProblemEntity problemEntity) {
		this.problemEntity = problemEntity;
	}

	public HintEntity getHintEntity() {
		return hintEntity;
	}

	public void setHintEntity(HintEntity hintEntity) {
		this.hintEntity = hintEntity;
	}

	public ConstraintEntity getConstraintEntity() {
		return constraintEntity;
	}

	public void setConstraintEntity(ConstraintEntity constraintEntity) {
		this.constraintEntity = constraintEntity;
	}

	public TestcaseEntity getTestcaseEntity() {
		return testcaseEntity;
	}

	public void setTestcaseEntity(TestcaseEntity testcaseEntity) {
		this.testcaseEntity = testcaseEntity;
	}
}
