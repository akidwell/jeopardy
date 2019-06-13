package com.jeopardy.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String round;
	private String category;
	private double value;
	private String question;
	private String answer;
	
	public Game() {
		super();
	}

	public Game(Integer id, String round, String category, double value, String question, String answer) {
		super();
		this.id = id;
		this.round = round;
		this.category = category;
		this.value = value;
		this.question = question;
		this.answer = answer;
	}

	public Game(String round, String category, double value, String question, String answer) {
		super();
		this.round = round;
		this.category = category;
		this.value = value;
		this.question = question;
		this.answer = answer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRound() {
		return round;
	}

	public void setRound(String round) {
		this.round = round;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", round=" + round + ", category=" + category + ", value=" + value + ", question="
				+ question + ", answer=" + answer + "]";
	}
	
	
	
}
