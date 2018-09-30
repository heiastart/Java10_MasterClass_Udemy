package com.oyvindsorlie;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int count[] = {2,5,6,8,15,24};

        // Regular set
        Set<Object> set = new HashSet<>();

        try {
            set.add(3);
            set.add("Ostepop");
            set.add("Potetgull");
            set.add("Superchips");

            for (int i=0; i<count.length; i++){
                set.add(count[i]);
            }

            System.out.println("Original set: " + set);

            // TreeSet - ascending order
            TreeSet sortedSet = new TreeSet(set);
            System.out.println("Sorted set: " + sortedSet); //Something wrong here....?

        }
        catch (Exception e){

        }

        // LinkedHashSet
        // This type (of set interface) contains all methods/functionality of sets AND can contain null.
        // Also, it maintains insertion order (as for Linked HashMap, but here it's the keys that are ordered by default)
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Movie");
        linkedHashSet.add("Potato");
        linkedHashSet.add("Gary");
        linkedHashSet.add("Cheese");
        linkedHashSet.add("Java");

        Iterator<String> iterator = linkedHashSet.iterator();

        // To iterate through our linked HashSet, we can do the following;
        while (iterator.hasNext()){
            System.out.println("Items " + iterator.next());
        }

    }
}
