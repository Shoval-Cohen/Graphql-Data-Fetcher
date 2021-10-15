package org.example.entities;

import java.util.List;

public class Continent extends IEntity {
    List<Country> countries;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                '}';
    }
}
