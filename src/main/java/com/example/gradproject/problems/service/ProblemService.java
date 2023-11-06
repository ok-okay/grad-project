package com.example.gradproject.problems.service;

import java.util.ArrayList;
//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gradproject.problems.dto.DTOMapper;
import com.example.gradproject.problems.dto.ProblemAggregateDTO;
import com.example.gradproject.problems.model.ProblemAggregateEntity;
import com.example.gradproject.problems.repository.ProblemRepository;

@Service
public class ProblemService {
	private final ProblemRepository problemRepo;
	private final DTOMapper dtoMapper;
	
	@Autowired
	public ProblemService(ProblemRepository problemRepo, DTOMapper dtoMapper) {
		this.problemRepo = problemRepo;
		this.dtoMapper = dtoMapper;
	}
	
	public void getProblemDescription(String url) {
		ArrayList<ProblemAggregateEntity> problemAggregateList = new ArrayList<>();
		problemAggregateList.addAll(problemRepo.getProblemAggregate(url));
	
		if(problemAggregateList.size()==0) {
			System.out.println("No records found");
		} else {
			ProblemAggregateDTO problemAggregate = dtoMapper.problemAggregateMapper(problemAggregateList);
			System.out.println(problemAggregate);
		}
	}
}
