package org.example;

public class Laptop implements Computer {

    private String lapName;

    private int ram;

    public Laptop(String lapName,int ram) {
        this.lapName = lapName;
        this.ram = ram;
    }

    @Override
    public void compile(){
        System.out.println("compiling the code using LAPTOP: " + lapName + " which has RAM: "+ ram +" GB....");
    }
}
