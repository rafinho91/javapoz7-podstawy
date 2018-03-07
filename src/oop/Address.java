package oop;

// pola w klasie majabyc private, dostep do nich za pomoca getterow i setterow
// alt+insert generowanie konstruktorow
// default dziala tylko w obrebie pakietu
// private tylko w danej klasie
// public ogolnodostepne

public class Address {
    public String street;
    public int houseNumber;
    public String postalCode;
    public String city;
    public String country;

    public Address(){
        this.city = "Poznan";
    }

    public Address(String street, int houseNumber, String postalCode, String city, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public void show() {
        System.out.println(street + " " + houseNumber + ", "
                + postalCode + " " + city + ", " + country);
    }

    // GETTERY I SETTERY

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
