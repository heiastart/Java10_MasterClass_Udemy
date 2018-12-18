package com.oyvindsorlie;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        // Add products
        list.add(new Product(1, "MacBook pro", 14000));
        list.add(new Product(2, "Huawei P20 pro", 7500));
        list.add(new Product(3, "Samsung TV", 14000));
        list.add(new Product(4, "Fridge", 3500));

        System.out.println("Sorting on name;");
        System.out.println("----------------");

        Collections.sort(list, Comparator.comparing(p -> p.name));

        for (Product p : list){
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
        System.out.println("");
        System.out.println("Sorting on id;");
        System.out.println("----------------");

        Collections.sort(list, Comparator.comparing(p -> p.id));

        for (Product p : list){
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

        /*
            Speakable speakable = (message) -> {
            String message1 = message + "Hello World, ";
            String message2 = message1 + "Another message";

            return message2;
            };
            System.out.println(speakable.speak("Funker det, mon tro.... "));

            -------------------------------------------------------------------

            // Lambdas with foreach-loop
            List<String> nameList = new ArrayList<>();
            nameList.add("Øyvind");
            nameList.add("Anne Cathrine");
            nameList.add("Gunvor");
            nameList.add("Morten");
            nameList.add("Trond");
            nameList.add("Bjørg");

            // To print out the names the hard way, we could use a std for-loop;
            for (String names : nameList){
                System.out.println(names);
            }

            // Or do this using lambda-expr and forEach method;
            nameList.forEach(
                    (names) -> System.out.println(names)
            );
            ------------------------------------------------------------------

            Addable addable1 = (a, b) -> (a + b);
            System.out.println("Sum of a and b is " + addable1.add(23, 48));
            Addable addable2 = (a, b) -> (a * b);

            -------------------------------------------------------------------

            Drawable drawable = (w, h) -> System.out.println("Size is " + w + " wide and " + h + " high.");
            drawable.draw(23, 10);
         */

    }
}

interface Speakable {
    String speak(String message);
}

interface Addable{
    int add(int a, int b);      // Method that returns an int.
}

interface Drawable {
    void draw(int width, int height);   // Method that doesn't return anything, since void.
    // void paint(String paint); -> the extra method creates problem in main...
}
