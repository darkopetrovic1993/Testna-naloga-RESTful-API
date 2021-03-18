package com.example.restservice;

import javax.persistence.*;

@Entity
@Table(name = "datumi")
public class Datum {

//    Definiramo dve spremenljivke.
    private long id;
    private String datum_spremenljivka;

//
    public Datum() {
    }

//    Constructor declaration of Class
    public Datum(String datum) {
        this.datum_spremenljivka = datum_spremenljivka;
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

//    Getters and setters za spremenljivko datum
    @Column(name = "datum", nullable = false)
    public String getDatum_spremenljivka() {
        return datum_spremenljivka;
    }
    public void setDatum_spremenljivka(String firstName) {
        this.datum_spremenljivka = datum_spremenljivka;
    }
//    Metoda
    @Override
    public String toString() {
        return "Datum [id=" + id + ", datum=" + datum_spremenljivka + "]";
    }
}