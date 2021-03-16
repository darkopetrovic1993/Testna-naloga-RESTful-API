package com.example.restservice;

import javax.persistence.*;

@Entity
@Table(name = "datumi")
public class Datum {

//    Definiramo dve spremenljivke.
    private long id;
    private String datum;

//
    public Datum() {
    }

//    Constructor declaration of Class
    public Datum(String datum) {
        this.datum = datum;
    }

//    Primary key. Zakaj ne stretegija GenerationType.SEQUENCE
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

//    Method
    @Override
    public String toString() {
        return "Datum [id=" + id + ", datum=" + datum + "]";
    }
//    Stara metoda
//    public String getDatum() {
//        return datum;
//    }

}