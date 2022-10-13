package com.company;

public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        System.out.println("Dancer learning dance");;
    }

    @Override
    public void walk() {
        System.out.println("Dancer walks around the hall");
    }

    @Override
    public void eat() {
        System.out.println("Dancer eating");
    }
    public void dancing(){
        System.out.println("dancer dancing");
    }

    @Override
    public String toString() {
        return "Dancer:" + " name:"+super.getName() +" designation:"+super.getDesignation() +" groupName='" + groupName + '\'' + '}';
    }
}


