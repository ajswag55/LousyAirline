package com.anoojpai;

public class Person {
    String firstName;
    String lastName;
    int income;


    // constructor that gets the values of first
    public Person(String firstname, String lastName, int income){
        this.firstName = firstname;
        this.lastName = lastName;
        this.income = income;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getIncome(){
        return income;
    }


    public String toString(){
        return firstName + " " + lastName ;
    }
}
