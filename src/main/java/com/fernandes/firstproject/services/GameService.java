package com.fernandes.firstproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandes.firstproject.dto.GameMinDTO;
import com.fernandes.firstproject.entities.Game;
import com.fernandes.firstproject.repositories.GameRepository;

@Service
public class GameService {
	 
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
