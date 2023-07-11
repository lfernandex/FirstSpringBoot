package com.fernandes.firstproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernandes.firstproject.dto.GameMinDTO;
import com.fernandes.firstproject.services.GameService;

@RestController
@RequestMapping(value = "/games")

public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
	var result = gameService.findAll();
	return result;
	}

}
