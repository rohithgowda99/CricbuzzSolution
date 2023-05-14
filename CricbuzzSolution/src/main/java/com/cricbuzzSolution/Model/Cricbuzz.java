package com.cricbuzzSolution.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Matches")
public class Cricbuzz {
	
	@Id
	private int id;
	
	@Column(name = "team1", nullable = false)
	private String team1;
	
	@Column(name = "team2", nullable = false)
	private String team2;
	
	@Column(name = "form", nullable = false)
	private String form;
	
	@Column(name = "date", nullable = false)
	private String date;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTeam1() {
		return team1;
	}


	public void setTeam1(String team1) {
		this.team1 = team1;
	}


	public String getTeam2() {
		return team2;
	}


	public void setTeam2(String team2) {
		this.team2 = team2;
	}


	public String getForm() {
		return form;
	}


	public void setForm(String form) {
		this.form = form;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Cricbuzz(int id, String team1, String team2, String form, String date) {
		super();
		this.id = id;
		this.team1 = team1;
		this.team2 = team2;
		this.form = form;
		this.date = date;
	}


	public Cricbuzz() {
		super();
		// TODO Auto-generated constructor stub
	}
}
