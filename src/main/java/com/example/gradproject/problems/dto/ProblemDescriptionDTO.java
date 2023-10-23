package com.example.gradproject.problems.dto;

public class ProblemDescriptionDTO {

	ProblemDTO problem;	
    HintDTO hint;
    ConstraintDTO constraint;
    TestcaseDTO testCase;
	
	public ProblemDescriptionDTO(ProblemDTO problem, HintDTO hint, ConstraintDTO constraint,
	TestcaseDTO testCase) {
		super();
		this.problem = problem;
		this.hint = hint;
		this.constraint = constraint;
		this.testCase = testCase;
	}
	    
	public ProblemDTO getProblem() {
		return problem;
	}
	public void setProblem(ProblemDTO problem) {
		this.problem = problem;
	}
	public HintDTO getHint() {
		return hint;
	}
	public void setHint(HintDTO hint) {
		this.hint = hint;
	}
	public ConstraintDTO getConstraint() {
		return constraint;
	}
	public void setConstraint(ConstraintDTO constraint) {
		this.constraint = constraint;
	}
	public TestcaseDTO getTestCase() {
		return testCase;
	}
	public void setTestCase(TestcaseDTO testCase) {
		this.testCase = testCase;
	}
}
