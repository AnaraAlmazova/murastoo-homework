package com.company;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        System.out.println("Programmer learns programmin");
    }

    @Override
    public void walk() {
        System.out.println("Programmer walks around the office");
    }

    @Override
    public void eat() {
        System.out.println("programmer eating");
    }

    public void coding(){
        System.out.println("programmer coding");
    }


    @Override
    public String toString() {
        return "Programmer:" + "  name:"+super.getName() +"  designation:"+super.getDesignation() +"  companyName='" + companyName + '\'' + '}';
    }
}


