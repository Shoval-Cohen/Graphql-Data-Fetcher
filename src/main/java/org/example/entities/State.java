package org.example.entities;

public class State {
    String code;
    String name;
    Country country;

        public String getCode() {
                return code;
        }

        public void setCode(String code) {
                this.code = code;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Country getCountry() {
                return country;
        }

        public void setCountry(Country country) {
                this.country = country;
        }
}
