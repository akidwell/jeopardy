package com.jeopardy.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String playerName;
	private double score;
	
	public Player() {
		super();
	}

	public Player(Integer id, String playerName, double score) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.score = score;
	}

	public Player(String playerName, double score) {
		super();
		this.playerName = playerName;
		this.score = score;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", score=" + score + "]";
	}
	
	

}
