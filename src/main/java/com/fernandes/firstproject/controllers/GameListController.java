package com.fernandes.firstproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernandes.firstproject.dto.GameListDTO;
import com.fernandes.firstproject.dto.GameMinDTO;
import com.fernandes.firstproject.services.GameListService;
import com.fernandes.firstproject.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
	List<GameListDTO> result = gameListService.findAll();
	return result;
	}

	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
	var result = gameService.findByList(listId);
	return result;
	}
}
