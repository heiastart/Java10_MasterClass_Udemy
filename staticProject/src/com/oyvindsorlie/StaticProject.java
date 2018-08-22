package com.oyvindsorlie;

public class StaticProject {

    private static String name;

    // Setter for the instance-var name
    public void setName(String n){
        name = n;
    }


    public static void main(String[] args) {

        StaticProject myProject = new StaticProject();
        myProject.setName("Fredrik");

        // In order to print variable name, it MUST be declared as static!!!!
        System.out.println(name);

        int myValue = -45;
        int secValue = 34;

        // The Math-class is a UTILITY CLASS, thus it is no need to instanciate it - Math math = new Math() - before calling/using it :)
        int x = Math.min(myValue, secValue);
        int y = Math.abs(myValue);

        System.out.println("X min: " + x + ",\nY abs: " + y);
    }
}
