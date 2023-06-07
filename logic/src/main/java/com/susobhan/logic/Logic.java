package com.susobhan.logic;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Logic {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
   private String name;
   private  String codes;

    public Logic() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }
}
