package com.softwareinstitute.cocktailsSpring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Glass {

    @Id
private String glass_type;
    private Integer glass_vol;


    public Glass(String glass_type, Integer glass_vol){
        this.glass_type = glass_type;
        this.glass_vol = glass_vol;
    }

    public Glass(){

    }

    public String getGlass_type() {
        return glass_type;
    }

    public void setGlass_type(String glass_type) {
        this.glass_type = glass_type;
    }

    public Integer getGlass_vol() {
        return glass_vol;
    }

    public void setGlass_vol(Integer glass_vol) {
        this.glass_vol = glass_vol;
    }

    @Override public String toString() {
        return "{" +
                "\"glass_type\"= \"" + glass_type +
                "\", \"glass_vol\"=\"" + glass_vol +
                "\"}";
    }

}