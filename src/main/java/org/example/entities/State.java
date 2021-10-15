package org.example.entities;

public class State extends IEntity{
    Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
