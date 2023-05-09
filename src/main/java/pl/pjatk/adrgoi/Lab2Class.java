package pl.pjatk.adrgoi;

public class Lab2Class {
    public String firstName;
    public String lastName;
    public Lab2Class(String firstName, String lastName){  //konstruktor
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {   //klasa prezentuje obiekt i pola dostępowe do niego
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
