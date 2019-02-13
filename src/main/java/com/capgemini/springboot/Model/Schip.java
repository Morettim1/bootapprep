package com.capgemini.springboot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Schip {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    long id;
    String type;
    int lengte;
    int aantalPassagiers;
    LocalDateTime bouwdatum;
    String naam;
    int topSnelHeid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(int aantalPassagiers) {
        this.aantalPassagiers = aantalPassagiers;
    }

    public LocalDateTime getBouwdatum() {
        return bouwdatum;
    }

    public void setBouwdatum(LocalDateTime bouwdatum) {
        this.bouwdatum = bouwdatum;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getTopSnelHeid() {
        return topSnelHeid;
    }

    public void setTopSnelHeid(int topSnelHeid) {
        this.topSnelHeid = topSnelHeid;
    }
}
