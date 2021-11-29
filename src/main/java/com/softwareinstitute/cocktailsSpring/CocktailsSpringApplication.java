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

	@Autowired
	private IngredientRepository ingredientRepository;

	@Autowired
	private EquipmentRepository equipmentRepository;

	@Autowired
	private GarnishRepository garnishRepository;

	@Autowired
	private InstructionsRepository instructionsRepository;

	@Autowired
	private GlassRepository glassRepository;


	public static void main(String[] args) {
		SpringApplication.run(CocktailsSpringApplication.class, args);
	}

	// @CrossOrigin("http://localhost:8080")

	@GetMapping("/allCocktails")
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

	@GetMapping("/allIngredients")
	public @ResponseBody
	Iterable<Ingredient> getAllIngredients() {
		return ingredientRepository.findAll();
	}

	@PostMapping("/addIngredient")
	public @ResponseBody String addIngredient(@RequestParam String ingred_desc, String ingred_id, String ingred_name, String ingred_type){

		Ingredient savedIngredient = new Ingredient(ingred_desc, ingred_id, ingred_name, ingred_type);
		ingredientRepository.save(savedIngredient);
		return "Saved";
	}

	@GetMapping("/allGarnish")
	public @ResponseBody
	Iterable<Garnish> getAllGarnish() {
		return garnishRepository.findAll();
	}

	@PostMapping("/addGarnish")
	public @ResponseBody String addGarnish(@RequestParam String garnish_id, String garnish_name, String garnish_desc){

		Garnish savedGarnish = new Garnish(garnish_id, garnish_name, garnish_desc);
		garnishRepository.save(savedGarnish);
		return "Saved";
	}

	@GetMapping("/allInstruct")
	public @ResponseBody
	Iterable<Instructions> getAllInstruct() {
		return instructionsRepository.findAll();
	}

	@PostMapping("/addInstruction")
	public @ResponseBody String addIntructions(@RequestParam String instruct_id, String instruct_desc, Integer instruct_order){

		Instructions savedInstructions = new Instructions(instruct_id, instruct_desc, instruct_order);
		instructionsRepository.save(savedInstructions);
		return "Saved";
	}

	@GetMapping("/allEquip")
	public @ResponseBody
	Iterable<Equipment> getAllEquip() {
		return equipmentRepository.findAll();
	}

	@PostMapping("/addEquipment")
	public @ResponseBody String addEquipment(@RequestParam String equip_id, String equip_name, String equip_desc ){

		Equipment savedEquipment = new Equipment(equip_id, equip_name, equip_desc);
		equipmentRepository.save(savedEquipment);
		return "Saved";
	}

	@GetMapping("/allGlass")
	public @ResponseBody
	Iterable<Glass> getAllGlass() {
		return glassRepository.findAll();
	}

	@PostMapping("/addGlass")
	public @ResponseBody String addGlass(@RequestParam String glass_type, Integer glass_vol){

		Glass savedGlass = new Glass(glass_type, glass_vol);
		glassRepository.save(savedGlass);
		return "Saved";
	}

}
