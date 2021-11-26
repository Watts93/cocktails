package com.softwareinstitute.cocktailsSpring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Equipment {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int id;

    private String equipment_id;
    private String equipment_name;
    private String equipment_desc;

    public Equipment(String equipment_id, String equipment_name, String equipment_desc){
        this.equipment_id = equipment_id;
        this.equipment_name = equipment_name;
        this.equipment_desc = equipment_desc;
    }

    public Equipment(){

    }

    public String getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(String equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getEquipment_desc() {
        return equipment_desc;
    }

    public void setEquipment_desc(String equipment_desc) {
        this.equipment_desc = equipment_desc;
    }

    @Override public String toString() {
        return "{" +
                "\"equipment_id\"= \"" + equipment_id +
                "\", \"equipment_name\"=\"" + equipment_name +
                "\", \"equipment_desc\"=\"" + equipment_desc +
                "\"}";
    }

}