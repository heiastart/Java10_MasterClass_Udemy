package com.oyvindsorlie;
import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMapsProject extends JFrame {

    public static void main(String[] args) {

        HashMap users = new HashMap();
        HashMap<String, Integer> newUsers = new HashMap<>(); //Here we specify that the key & value MUST be of type String & Int.

        users.put("Kealy", 34);
        System.out.println(users.get("Kealy"));
        users.remove("Kealy");
        users.put("Bob", 40);
        users.put("Frank", 45);

        if (users.containsKey("Kealy")){
            System.out.println("Yeay!!");
        }
        else {
            System.out.println("Nope!!!");
        }

        //System.out.println("Values are: " + users.values());
        //System.out.println("In dictionary: " + users.entrySet());

        // Iterate through a hashmap/dictionary
        Iterator iterator = users.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }
}
