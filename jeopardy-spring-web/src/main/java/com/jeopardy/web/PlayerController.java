package com.jeopardy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeopardy.business.JsonResponse;
import com.jeopardy.business.Player;
import com.jeopardy.repo.PlayerRepository;



	@RestController
	@RequestMapping("/players")
	public class PlayerController {

		@Autowired
		private PlayerRepository playerRepo;
		
		@GetMapping("/all")
		public JsonResponse getAll() {
			JsonResponse jr = null;
			try {
				jr = JsonResponse.getInstance(playerRepo.findAll());
			} catch (Exception e) {
				jr = JsonResponse.getInstance(e);
			}
			return jr;
		}
			
		@PostMapping("/")
		public JsonResponse addPurchaseRequest(@RequestBody Player p) {
			JsonResponse jr = null;
			// NOTE: May need to enhance exception handling if more than one exception type
			// needs caught
			try {
				jr = JsonResponse.getInstance(playerRepo.save(p));
			} catch (Exception e) {
				jr = JsonResponse.getInstance(e);
				System.out.println(e);
			}
			return jr;
		}
}

