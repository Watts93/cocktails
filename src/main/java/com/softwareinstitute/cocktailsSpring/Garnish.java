package com.softwareinstitute.cocktailsSpring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Garnish {

    @Id
 private String garnish_id;
    private String garnish_name;
    private String garnish_desc;

    public Garnish(String garnish_id, String garnish_name, String garnish_desc){
        this.garnish_id = garnish_id;
        this.garnish_name = garnish_name;
        this.garnish_desc = garnish_desc;
    }

    public Garnish(){

    }

    public String getGarnish_id() {
        return garnish_id;
    }

    public void setGarnish_id(String garnish_id) {
        this.garnish_id = garnish_id;
    }

    public String getGarnish_name() {
        return garnish_name;
    }

    public void setGarnish_name(String garnish_name) {
        this.garnish_name = garnish_name;
    }

    public String getGarnish_desc() {
        return garnish_desc;
    }

    public void setGarnish_desc(String garnish_desc) {
        this.garnish_desc = garnish_desc;
    }

    @Override public String toString() {
        return "{" +
                "\"garnish_id\"= \"" + garnish_id +
                "\", \"garnish_name\"=\"" + garnish_name +
                "\", \"garnish_desc\"=\"" + garnish_desc +
                "\"}";
    }

}