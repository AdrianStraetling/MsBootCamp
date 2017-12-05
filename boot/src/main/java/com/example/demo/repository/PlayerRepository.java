package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.domain.Player;

@RestResource(path = "players", rel = "player")
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
