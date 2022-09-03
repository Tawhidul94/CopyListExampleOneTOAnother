package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CopyList {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Lichi");
        System.out.println(fruits);

        //One List Copy to another list 4 way.

        //use conustractor copy one list to another list
        List<String> frutits1 = new ArrayList<>(fruits);
        System.out.println("Constructor Method :"+frutits1);

        //use add all method
        List<String> fruits2 = new ArrayList<>();
        fruits2.addAll(fruits);
        System.out.println("Add all Method:"+fruits2);

        //using collection copy method
        List<String> fruits3 = new ArrayList<>(fruits.size());
        fruits3.add("a");
        fruits3.add("b");
        fruits3.add("c");
        fruits3.add("d");
        fruits3.add("e");
        Collections.copy(fruits3,fruits);
        System.out.println("Copy method :"+fruits3);

        //Strem api
        List<String> fruits4 = fruits.stream().collect(Collectors.toList());
        System.out.println("Using stream :" +fruits4);
    }
}
