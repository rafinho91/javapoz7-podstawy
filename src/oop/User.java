package oop;

// KLASA TO PRZEPIS NA OBIEKT
// OBIEKT TO INSTANCJA KLASY

import java.util.Objects;

public class User {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;
    public Address address;

// konstruktory wymuszaja podanie zmiennej przed utworzeniem


    public User() {

    }

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void introduceYourself() {
        System.out.println(this.firstName + " " + lastName +
                ", phone number: " + phoneNumber + ", email: " + email);
        if (address != null) {
            address.show();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(phoneNumber, user.phoneNumber) &&
                Objects.equals(email, user.email) &&
                Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, phoneNumber, email, address);
    }
}
