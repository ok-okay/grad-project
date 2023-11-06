package com.example.gradproject.problems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.gradproject.problems.model.ProblemAggregateEntity;
import com.example.gradproject.problems.model.ProblemEntity;

@Repository
public interface ProblemRepository extends JpaRepository<ProblemEntity, Long> {
    @Query("SELECT NEW com.example.gradproject.problems.model.ProblemAggregateEntity("
    		+ "problem, hint, constraint, testcase) " + 
    		"FROM ProblemEntity problem " + 
    		"JOIN FETCH HintEntity hint ON hint.problem.id = problem.id " +
    		"JOIN FETCH ConstraintEntity constraint ON constraint.problem.id = problem.id " +
    		"JOIN FETCH TestcaseEntity testcase ON testcase.problem.id = problem.id " +
    		"WHERE problem.url = :url")
    List<ProblemAggregateEntity> getProblemAggregate(@Param("url") String url);
}
