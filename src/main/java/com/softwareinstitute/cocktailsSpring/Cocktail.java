package com.softwareinstitute.cocktailsSpring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Cocktail {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int id;

    private String cocktail_name;
    private String cocktail_type;
    private Integer cocktail_av;

    public Cocktail(String cocktail_name, String cocktail_type, Integer cocktail_av){
        this.cocktail_name = cocktail_name;
        this.cocktail_type = cocktail_type;
        this.cocktail_av = cocktail_av;
    }

    public Cocktail(){

    }

    public String getCocktail_name() {
        return cocktail_name;
    }

    public void setCocktail_name(String cocktail_name) {
        this.cocktail_name = cocktail_name;
    }

    public String getCocktail_type() {
        return cocktail_type;
    }

    public void setCocktail_type(String cocktail_type) {
        this.cocktail_type = cocktail_type;
    }

    public Integer getCocktail_av() {
        return cocktail_av;
    }

    public void setCocktail_av(Integer cocktail_av) {
        this.cocktail_av = cocktail_av;
    }

    @Override public String toString() {
        return "{" +
                "\"cocktail_name\"= \"" + cocktail_name +
                "\", \"cocktail_type\"=\"" + cocktail_type +
                "\", \"cocktail_av\"=\"" + cocktail_av +
                "\"}";
    }

}