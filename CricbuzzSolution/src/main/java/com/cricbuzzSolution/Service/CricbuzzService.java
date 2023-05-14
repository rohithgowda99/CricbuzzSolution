package com.cricbuzzSolution.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricbuzzSolution.Model.Cricbuzz;
import com.cricbuzzSolution.repository.CricbuzzRepository;

@Service
public class CricbuzzService {

	@Autowired
	private CricbuzzRepository cricbuzzRepository;
	
	public List<Cricbuzz> getAllMatches() {
		return cricbuzzRepository.findAll();
	}
	
	public Cricbuzz addMatch(Cricbuzz cricbuzz) {
		return cricbuzzRepository.save(cricbuzz);
	}
	
	public List<Cricbuzz> getMatchesByForm(String form) {
		return cricbuzzRepository.findByForm(form);
	}
	
}
