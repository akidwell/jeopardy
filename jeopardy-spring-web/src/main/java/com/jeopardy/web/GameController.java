package com.jeopardy.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.jeopardy.business.Game;
import com.jeopardy.business.JsonResponse;
import com.jeopardy.repo.GameRepository;


	
	@RestController
	@RequestMapping("/game")
	public class GameController {

		@Autowired
		private GameRepository gameRepo;
		
		@GetMapping("/")
		public JsonResponse getFiveRandomCategories() {
			JsonResponse jr = null;
			try {
				jr = JsonResponse.getInstance(getRandomCategory());
			} catch (Exception e) {
				jr = JsonResponse.getInstance(e);
			}
			return jr;
		}	

		
		public List<List<Game>> getRandomCategory() {
			//1.) find all the distinct categories in the Jeopardy! round and puts in a list
			List<String> igames = gameRepo.findDistinctCategoryByRound("Jeopardy!");
			//2.) creating the empty list of list (confusing, i know)
			List<List<Game>> listOfGames = new ArrayList<>(); 
			//3.) for loop picking out a random categories and it's data 5 times
			for (int x= 1; x <= 5; x++) {
			Random rand = new Random();
			int random = rand.nextInt(igames.size());
			String category = igames.get(random);
			//4.) adding the data to the list of list
			listOfGames.add(gameRepo.findByCategoryAndRound(category, "Jeopardy!")); 
			//5.) then removes the random stuff you just got so it's not duplicate
			igames.remove(random);
			}
			//6.) returns that list of lists, which is the distinct, random category by round and all of its data
			return listOfGames;
		}
	
		
		}
	