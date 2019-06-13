package com.jeopardy.repo;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jeopardy.business.Game;

public interface GameRepository extends CrudRepository<Game, Integer> {
	
	@Query ("SELECT DISTINCT category from Game where round = ?1")
	List<String> findDistinctCategoryByRound(String round);
	
	List<Game> findByCategoryAndRound(String category, String round);
}
