package com.example.gradproject.problems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.gradproject.problems.model.ProblemEntity;

public interface ProblemRepository extends JpaRepository<ProblemEntity, Long> {
    @Query("SELECT problem FROM ProblemEntity problem " + 
    		"JOIN FETCH problem.ConstraintEntity constraint " +
    		"JOIN FETCH problem.HintEntity hint " +
    		"JOIN FETCH problem.TestcaseEntity testcase " +
    		"WHERE p.heading = :heading")
    ProblemEntity getProblemFromHeading(@Param("heading") String heading);

}
