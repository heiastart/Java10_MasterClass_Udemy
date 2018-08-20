package com.oyvindsorlie;

import java.util.ArrayList;

public class JavaArrayList {

    public static void main(String[] args){

        // ArrayList - a more flexible and less static array ("array 2.0")
        // Inside the <> we put the TYPE of object we want to input (i.e have in the arraylist).
        // Also notice that we did NOT have to specify the SIZE of the list/array, as for the std array-type...
        ArrayList<String> animals = new ArrayList<>();
        // Here, we created the animals ArrayList of type String....

        animals.add("Hund");
        animals.add("Katt");
        animals.add("Gullfisk");
        animals.add("Apekatt");

        for (int i=0; i<animals.size(); i++){
            System.out.println("Animals: " + animals.get(i));
        }
        animals.remove(1);
        animals.remove("Apekatt");
        //animals.clear();

        System.out.println();

        if (animals.contains("Hund")){
            animals.remove("Hund");
            System.out.println("Fjernet hund");
        }
        else {
            animals.add("Kylling");
            System.out.println("La til kylling");
        }

        // or like this, used in the else - better and cleaner way to write the loop;
        if (animals.isEmpty()){
            System.out.println("No animals are present....");
        }
        else {
            for (String animal : animals){
                System.out.println("Animals: " + animal);
            }
        }

        System.out.println();
        System.out.println("Size of animals: " + animals.size());
    }
}
