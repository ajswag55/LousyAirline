package com.anoojpai;

public class Main {

    public static void main(String []args){
        Seat s1 = new Seat(1,'f');
        Seat s2 = new Seat(2, 'f');
        Seat s3 = new Seat(3,'b');
        Seat s4 = new Seat(4, 'b');
        Person p1 = new Person("Anooj", "Pai", 300);
        Person p2 = new Person("Michael", "Wu", 300);
        Person p3 = new Person("bAnooj", "bPai", 300);
        Person p4 = new Person("bMichael", "bWu", 300);
        Airplane a1 = new Airplane();

//
//        s1.setPassenger(p1);
//        s2.setPassenger(p2);
//        s3.setPassenger(p3);
//        s4.setPassenger(p4);
//
//       System.out.println(s1.getClassdes());
//        System.out.println(s1.getPassenger());
//       System.out.println(s1.getSeatNumber());
//
//       System.out.println(s1.isEmpty());
//        System.out.println(s1.ejectPassenger());
//        System.out.println(s1.isEmpty());
//
//
//
//        s1.ejectPassenger();
//        s1.displaySeat();
//        s2.displaySeat();

        a1.testMe();


    }
}
