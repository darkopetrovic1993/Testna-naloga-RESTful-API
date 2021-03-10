package com.example.restservice;

import javax.persistence.Entity;

@Entity
public class Datum {
    private final String datum;

    // Constructor declaration of Class
    public Datum(String datum) {
        this.datum = datum;
    }

    // Method
    public String getDatum() {
        return datum;
    }
}