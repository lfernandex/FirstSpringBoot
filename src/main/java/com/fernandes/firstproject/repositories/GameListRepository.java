package com.fernandes.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandes.firstproject.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	

}
