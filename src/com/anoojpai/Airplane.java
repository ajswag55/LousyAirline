package com.anoojpai;

public class Airplane {
    Person p1 = new Person("Anooj", "Pai", 300);
    Person p2 = new Person("Michael", "Wu", 45);
    Person p3 = new Person("Brad", "Smith", 1000);
    Person p4 = new Person("Chad", "Miller", 80);
    Person p5 = new Person("Jack", "Glover", 15);
    Person p6 = new Person("Matt", "Mathers", 180);

    Seat s1 = new Seat(1, 'f');
    Seat s2 = new Seat(2,'b');
    Seat s3 = new Seat(3, 'c');
    Seat s4 = new Seat(4, 'f');

    public Airplane(){
        s1.classdes = 'f';
        s2.classdes = 'b';
        s3.classdes = 'b';
        s4.classdes = 'c';
    }

    public boolean isFull() {
        if(s1.isEmpty()==false && s2.isEmpty()==false && s3.isEmpty()==false && s4.isEmpty()==false){
            return true;
        }else{
            return false;
        }
    }

    public void assignSeat(Person b, Seat a){
        if(a.isEmpty() == true) {
            a.setPassenger(b);
        }else if(a.isEmpty() == false){
            if(a.Passenger.income > (2*b.income)){
                a.ejectPassenger();
                a.setPassenger(b);
            }else{
                System.out.println("Seat is occupied");
            }
        }
    }

    public void testMe(){
//        System.out.println(isFull());
//        isAffordable(p1, s1);
//        isAffordable(p2, s2);
//        isAffordable(p3, s3);
//        isAffordable(p4, s4);
//        s1.displaySeat();
//        s2.displaySeat();
//        s3.displaySeat();
//        s4.displaySeat();
        assignSeat(p1,s1);
        assignSeat(p1,s2);
        assignSeat(p2,s2);
        assignSeat(p2,s3);
        assignSeat(p3,s3);
        assignSeat(p3,s4);
        assignSeat(p4,s4);
        s1.displaySeat();
        s2.displaySeat();
        s3.displaySeat();
        s4.displaySeat();

    }

    public boolean isAffordable(Person c, Seat b){
        if(b.classdes == 'f'){
            b.cost = 150;
        }else if(b.classdes == 'b'){
            b.cost = 75;
        }else{
            b.cost = 0;
        }
        if(c.income >= b.cost){
            b.setPassenger(c);
            System.out.println("Seat acquired");
            return true;
        }else{
            System.out.println("you can't afford this seat");
            return false;
        }
    }
}
