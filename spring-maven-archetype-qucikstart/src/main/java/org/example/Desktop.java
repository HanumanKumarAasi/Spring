package org.example;

public class Desktop implements Computer{

    private String desktopName;

    private int cpuram;

    public Desktop(String desktopName,int cpuram) {
        this.desktopName = desktopName;
        this.cpuram = cpuram;
    }

    @Override
    public void compile(){
        System.out.println("compiling the code using DESKTOP: " + desktopName + " which has RAM: "+ cpuram +" GB....");
    }

}
