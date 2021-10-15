package org.example.entities;

import java.util.List;

public class Country extends IEntity{
    String nativeLang;
    String phone;
    Continent continent;
    String capital;
    String currency;
    List<Language> languages;
    String emoji;
    String emojiU;
    List<State> states;

    public String getNative() {
        return nativeLang;
    }

    public void setNative(String nativeLang) {
        this.nativeLang = nativeLang;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getEmojiU() {
        return emojiU;
    }

    public void setEmojiU(String emojiU) {
        this.emojiU = emojiU;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }
}
