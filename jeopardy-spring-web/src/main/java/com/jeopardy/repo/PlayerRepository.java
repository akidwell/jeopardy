package com.jeopardy.repo;

import org.springframework.data.repository.CrudRepository;

import com.jeopardy.business.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
