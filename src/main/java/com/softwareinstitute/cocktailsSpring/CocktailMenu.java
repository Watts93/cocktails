package com.softwareinstitute.cocktailsSpring;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class CocktailMenu {
    private List<Cocktail> cocktailList = new ArrayList();
    private List<Ingredient> ingredientList = new ArrayList();
    private List<Garnish> garnishList = new ArrayList();

    public CocktailMenu(){
        this.cocktailList.add(new Cocktail("Gin and Tonic","Stirred",32));
        this.ingredientList.add(new Ingredient("I1","Gin","Alcohol","Bottled"));
        this.ingredientList.add(new Ingredient("I2","Tonic","Soft Drink","Can"));
        this.garnishList.add(new Garnish("G1","Lime", "Slice"));
    }

    public List<Cocktail> getCocktailList(){
        return this.cocktailList;
    }

    public List<Ingredient> getIngredientList(){
        return this.ingredientList;
    }

    public List<Garnish> getGarnishList(){
        return this.garnishList;
    }

    public String toString(){
        String json = new Gson().toJson(cocktailList);
        return  json;
    }


}
