package com.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Model.Player;

@RestController
@RequestMapping("players")
public class MyRestController {
	///localhost:8080/players
	@PostMapping
	public Player saveData(@RequestBody Player player) {
		System.out.println(player.toString());
		return player;
	}
	@GetMapping
	public Player getData() {
		return new Player(7, "MS Dhoni", "CSK");
	}
	//localhost:8080/players/Virat
	@GetMapping("/{name}")
	public Player getData1(@PathVariable String name) {
		return new Player(18,name, "RCB");
	}
	//localhost:8080/players/Virat/RCB
	@GetMapping("/{name}/{team}")
	public Player getData2(@PathVariable String name,@PathVariable String team) {
		return new Player(18,name,team);
	}
	@PutMapping
	public String putData() {
		return "Put Data";
	}
	@DeleteMapping
	public String deleteData() {
		return "Delete Data";
	}

}
