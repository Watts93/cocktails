package com.softwareinstitute.cocktailsSpring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Ingredient {

    @Id
private String ingred_id;
    private String ingred_name;
    private String ingred_type;
    private String ingred_desc;

    public Ingredient(String ingred_id, String ingred_name, String ingred_type, String ingred_desc){
        this.ingred_id = ingred_id;
        this.ingred_name = ingred_name;
        this.ingred_type = ingred_type;
        this.ingred_desc = ingred_desc;
    }

    public Ingredient() {

    }

    public String getIngred_id() {
        return ingred_id;
    }

    public void setIngred_id(String ingred_id) {
        this.ingred_id = ingred_id;
    }

    public String getIngred_name() {
        return ingred_name;
    }

    public void setIngred_name(String ingred_name) {
        this.ingred_name = ingred_name;
    }

    public String getIngred_type() {
        return ingred_type;
    }

    public void setIngred_type(String ingred_type) {
        this.ingred_type = ingred_type;
    }

    public String getIngred_desc() {
        return ingred_desc;
    }

    public void setIngred_desc(String ingred_desc) {
        this.ingred_desc = ingred_desc;
    }

    @Override public String toString() {
        return "{" +
                "\"ingred_id\"= \"" + ingred_id +
                "\", \"ingred_name\"=\"" + ingred_name +
                "\", \"ingred_type\"=\"" + ingred_type +
                "\", \"ingred_desc\"=\"" + ingred_desc +
                "\"}";
    }

}