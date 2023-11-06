package com.example.gradproject.problems.dto;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.example.gradproject.problems.model.ConstraintEntity;
import com.example.gradproject.problems.model.HintEntity;
import com.example.gradproject.problems.model.ProblemAggregateEntity;
import com.example.gradproject.problems.model.ProblemEntity;
import com.example.gradproject.problems.model.TestcaseEntity;

@Component
public class DTOMapper {
	public ProblemDTO problemMapper(ProblemEntity entity) {
        ProblemDTO dto = new ProblemDTO();
        
        dto.setId(entity.getId());
        dto.setHeading(entity.getHeading());
        dto.setUrl(entity.getUrl());
        dto.setQuestion(entity.getQuestion());
        dto.setDifficulty(entity.getDifficulty().name());
        
        dto.setUpvotes(entity.getUpvotes());
        dto.setDownvotes(entity.getDownvotes());
        dto.setSubmissions(entity.getSubmissions());
        dto.setAccepted(entity.getAccepted());
        
        return dto;
    }
	
	public HintDTO hintMapper(HintEntity entity) {
        HintDTO dto = new HintDTO();
        
        dto.setId(entity.getId());
        dto.setHintDescription(entity.getHintDescription());
        dto.setProblem_id(entity.getProblem().getId());
        
        return dto;
    }
	
	public ConstraintDTO constraintMapper(ConstraintEntity entity) {
        ConstraintDTO dto = new ConstraintDTO();
        
        dto.setId(entity.getId());
        dto.setConstraintDescription(entity.getConstraintDescription());
        dto.setProblem_id(entity.getProblem().getId());
        
        return dto;
    }
	
	public TestcaseDTO testcaseMapper(TestcaseEntity entity) {
		TestcaseDTO dto = new TestcaseDTO();
        
        dto.setId(entity.getId());
        dto.setInput(entity.getInput());
        dto.setOutput(entity.getOutput());
        dto.setExplanation(entity.getExplanation());
        dto.setProblem_id(entity.getProblem().getId());
        
        return dto;
    }
	
	public ProblemAggregateDTO problemAggregateMapper(ArrayList<ProblemAggregateEntity> problemAggregateList) {
		ProblemAggregateDTO dto = new ProblemAggregateDTO();
		dto.setProblem(problemMapper(problemAggregateList.get(0).getProblemEntity()));
		return dto;
	}

}
