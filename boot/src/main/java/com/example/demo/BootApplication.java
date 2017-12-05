package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import com.example.demo.repository.TeamRepository;

@SpringBootApplication
public class BootApplication {

	// ramp up with some Data
	@Autowired
	private TeamRepository teamRepository;

	@PostConstruct
	public void initPlayerDb() {
		List<Team> list = new ArrayList<>();

		Set<Player> set = new HashSet<>();
		set.add(new Player("Big Easy", "Showman"));
		set.add(new Player("Buckets", "Guard"));
		set.add(new Player("Dizzy", "Guard"));

		list.add(new Team("Harlem", "Globetrotters", set));
		list.add(new Team("Washington", "Generals", null));

		teamRepository.save(list);
	}

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}
