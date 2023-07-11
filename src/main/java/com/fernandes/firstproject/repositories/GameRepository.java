package com.fernandes.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandes.firstproject.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	

}
