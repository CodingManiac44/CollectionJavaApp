package com.collection.app;

import java.util.ArrayList;
import java.util.HashSet;

public class Service {
    static ArrayList<Object> s = new ArrayList<>();
    public static ArrayList<Object> printCollectionList(){
        // Adding an integer to the ArrayList
        s.add(5);

        // Adding other types of objects to the ArrayList
        s.add("Hello");
        s.add(3.14);
        s.add(true);

        HashSet<Object> uniqueItems = new HashSet<>();
        for (Object temp : s) {
            if (uniqueItems.add(temp)) {
                System.out.println("Value for this index is: " + temp);
            }
        }

        return s;
    }


}
