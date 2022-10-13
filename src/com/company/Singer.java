package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    @Override
    public void learn() {
        System.out.println("Singer sings songs");
    }

    @Override
    public void walk() {
        System.out.println("Singer walks");
    }

    @Override
    public void eat() {
        System.out.println("singer eating");
    }
    public void singing(){
        System.out.println("Singer singing");
    }
    public void playGitar(){
        System.out.println("singer play gitar");
    }

    @Override
    public String toString() {
        return "Singer:" + "  name:"+super.getName() +"  designation: "+super.getDesignation() +"  bandName='" + bandName + '\'' + '}';
    }
}

