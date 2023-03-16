package com.NFZ.spring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Id;

    private String Imie;

    private String Nazwisko;

    private Long Pesel;

    private String Miasto;

    private String Ulica;

    private Integer NumerDomu;

    private String Email;

    //@Past
    private String Datauro;

    private String Datawizyty;

    private String Specjalizacja;

    private String Placowka;


    public String getPlacowka() {
        return Placowka;
    }

    public void setPlacowka(String placowka) {
        Placowka = placowka;
    }

    public String getDatauro() {
        return Datauro;
    }

    public void setDatauro(String datauro) {
        Datauro = datauro;
    }

    public String getDatawizyty() {
        return Datawizyty;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setDatawizyty(String datawizyty) {
        Datawizyty = datawizyty;
    }

    public String getSpecjalizacja() {
        return Specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        Specjalizacja = specjalizacja;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public Long getPesel() {
        return Pesel;
    }

    public void setPesel(Long pesel) {
        Pesel = pesel;
    }

    public String getMiasto() {
        return Miasto;
    }

    public void setMiasto(String miasto) {
        Miasto = miasto;
    }

    public String getUlica() {
        return Ulica;
    }

    public void setUlica(String ulica) {
        Ulica = ulica;
    }

    public Integer getNumerDomu() {
        return NumerDomu;
    }

    public void setNumerDomu(Integer numerDomu) {
        NumerDomu = numerDomu;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

}
