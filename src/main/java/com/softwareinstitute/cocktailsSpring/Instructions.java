package com.softwareinstitute.cocktailsSpring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Instructions {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int id;

    private String instruct_id;
    private String instruct_desc;
    private Integer instruct_order;

    public Instructions(String instruct_id, String instruct_desc, Integer instruct_order){
        this.instruct_id = instruct_id;
        this.instruct_desc = instruct_desc;
        this.instruct_order = instruct_order;
    }

    public Instructions() {

    }

    public String getInstruct_id() {
        return instruct_id;
    }

    public void setInstruct_id(String instruct_id) {
        this.instruct_id = instruct_id;
    }

    public String getInstruct_desc() {
        return instruct_desc;
    }

    public void setInstruct_desc(String instruct_desc) {
        this.instruct_desc = instruct_desc;
    }

    public Integer getInstruct_order() {
        return instruct_order;
    }

    public void setInstruct_order(Integer instruct_order) {
        this.instruct_order = instruct_order;
    }

    @Override public String toString() {
        return "{" +
                "\"instruct_id\"= \"" + instruct_id +
                "\", \"instruct_desc\"=\"" + instruct_desc +
                "\", \"instruct_order\"=\"" + instruct_order +
                "\"}";
    }

}
