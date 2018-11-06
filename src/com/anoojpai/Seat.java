package com.anoojpai;

import com.anoojpai.Person;

public class Seat {
    int seatNumber;
    char classdes;
    Person Passenger;
    int cost;

    public Seat(int seatNumber, char classdes){
        this.seatNumber = seatNumber;
        this.classdes = classdes;
        Passenger = null;
    }


    public boolean isEmpty() {
        if (Passenger == null) {
            return true;
        }
        return false;
    }
    public void setPassenger(Person a){
        if(null == Passenger) {
            Passenger = a;
        }else{
            System.out.println("Seat not available");
        }
    }

    public Person ejectPassenger(){
        if(Passenger != null) {
            Person pass2 = Passenger;
            Passenger = null;
            return pass2;
        }else{
            System.out.println("is already empty");
            return null;
        }
    }

    public int getSeatNumber(){
        return seatNumber;
    }

    public char getClassdes(){
        return classdes;
    }

    public Person getPassenger(){
        return Passenger;
    }

    public void displaySeat(){
        String display = "";
        display += "Seat #: " + getSeatNumber();
        display += " Class Designation: " + getClassdes();
        if(isEmpty() == true){
            display += " Unoccupied";
        }else if(isEmpty() == false){
            display += " Passenger: " + getPassenger();
        }
        System.out.println(display);
    }
}
