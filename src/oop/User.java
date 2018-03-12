package oop;

// KLASA TO PRZEPIS NA OBIEKT
// OBIEKT TO INSTANCJA KLASY

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

}
