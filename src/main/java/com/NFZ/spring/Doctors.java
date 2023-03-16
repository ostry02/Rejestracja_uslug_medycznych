package com.NFZ.spring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctors {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String Nazwa;
    private String Specjalizacja;
    private String Stopien;
    private String Placowka;

    public String getPlacowka() {
        return Placowka;
    }
    public void setPlacowka(String placowka) {
        Placowka = placowka;
    }

    public String getStopien() {
        return Stopien;
    }
    public void setStopien(String stopien) {
        Stopien = stopien;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwa() {
        return Nazwa;
    }
    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public String getSpecjalizacja() {
        return Specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        Specjalizacja = specjalizacja;
    }
}
