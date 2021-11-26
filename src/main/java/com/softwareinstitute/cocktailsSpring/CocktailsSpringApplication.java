package com.softwareinstitute.cocktailsSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/cocktails")
public class CocktailsSpringApplication {


	@Autowired
	private CocktailRepository cocktailRepository;

	public static void main(String[] args) {
		SpringApplication.run(CocktailsSpringApplication.class, args);
	}

	// @CrossOrigin("http://localhost:8080")

	@GetMapping("/all")
	public @ResponseBody
	Iterable<Cocktail> getAllCocktails() {
		return cocktailRepository.findAll();
	}

	@PostMapping("/addCocktail")
	public @ResponseBody String addCocktail(@RequestParam String cocktail_name, String cocktail_type, Integer cocktail_av){

		Cocktail savedCocktail = new Cocktail(cocktail_name,cocktail_type,cocktail_av);
		cocktailRepository.save(savedCocktail);
		return "Saved";

	}

}
