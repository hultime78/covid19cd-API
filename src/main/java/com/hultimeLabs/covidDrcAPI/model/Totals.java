package com.hultimeLabs.covidDrcAPI.model;


import javax.persistence.*;

@Entity
@Table(name="Totals")
public class Totals {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int confirmed;
    private int discharge ;
    private int deaths ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getDischarge() {
        return discharge;
    }

    public void setDischarge(int discharge) {
        this.discharge = discharge;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }
}
