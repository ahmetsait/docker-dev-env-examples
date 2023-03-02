package com.defia.soft;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private HumanRepository humanRepository;

	@GetMapping("/")
	public String index(@RequestParam(value = "id", defaultValue = "0") Long id) {
		Optional<Human> human = humanRepository.findById(id);
		return String.format("Hello %s!\n", human.isPresent() ? human.get().getName() : "World");
	}

}
