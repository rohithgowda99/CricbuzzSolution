package com.cricbuzzSolution.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricbuzzSolution.Model.Cricbuzz;

@Repository
public interface CricbuzzRepository extends JpaRepository<Cricbuzz, Integer> {

	List<Cricbuzz> findByForm(String form);
	
}