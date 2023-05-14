package com.cricbuzzSolution.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricbuzzSolution.Model.Cricbuzz;
import com.cricbuzzSolution.Service.CricbuzzService;

@RestController
@RequestMapping("/api/cricbuzz")
public class CricbuzzController {

	@Autowired
	private CricbuzzService cricbuzzService;

	@PostMapping("/matches")
	public ResponseEntity<Cricbuzz> addMatch(@RequestBody Cricbuzz match) {
		Cricbuzz newMatch = cricbuzzService.addMatch(match);
		return new ResponseEntity<Cricbuzz>(newMatch, HttpStatus.CREATED);
	}

	@GetMapping("/matches")
	public ResponseEntity<List<Cricbuzz>> getAllMatches() {
		List<Cricbuzz> matches = cricbuzzService.getAllMatches();
		return new ResponseEntity<List<Cricbuzz>>(matches, HttpStatus.OK);
	}

	@GetMapping("/matches/form/{form}")
	public ResponseEntity<List<Cricbuzz>> getMatchesByForm(@PathVariable String form) {
		List<Cricbuzz> matches = cricbuzzService.getMatchesByForm(form);
		return new ResponseEntity<List<Cricbuzz>>(matches, HttpStatus.OK);
	}


}