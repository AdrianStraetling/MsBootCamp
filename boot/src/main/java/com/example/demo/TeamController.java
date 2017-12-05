package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.domain.Team;
import com.example.demo.repository.TeamRepository;

//@RestController // not using this but the annotated stuff on repository/* stuff
public class TeamController {

	@Value("${my.property}")
	String test;

	@Autowired
	TeamRepository teamRepository;

	@GetMapping(path = "teams")
	Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}

	@GetMapping(path = "teams/{id}")
	Team getTeam(@PathVariable Long id) {
		return teamRepository.findOne(id);
	}

}
