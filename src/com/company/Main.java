package com.company;

public class Main {

    public static void main(String[] args) {
	Programmer programmer=new Programmer("Jack","IT","META");
    Dancer dancer=new Dancer("Aliya", "Tektonic","DBD");
    Singer singer=new Singer("Alisa","K-POP", "PINK");
        System.out.println(programmer);
        programmer.coding();
        System.out.println(dancer);
        dancer.dancing();
        System.out.println(singer);
        singer.singing();
        singer.playGitar();

    }
}
