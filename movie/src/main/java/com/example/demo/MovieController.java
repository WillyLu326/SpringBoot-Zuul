package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@RequestMapping(value = "/ghostbusters")
	public List<String> available() {
		List<String> movies = new ArrayList<>();
		movies.add("Ghostbusters (1984)");
		movies.add("Ghostbusters (2016)");
		return movies;
	}
	
}
