package com.ram.core.collection.objectOrdering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author rams0516
 *         Date: 3/9/2018
 *         Time: 4:12 PM
 */
public class OrderingDemo {
    static String[] names = {"ram", "sam", "aam", "pm"};

    static List<String> nameList = new ArrayList<>(Arrays.asList(names));

    public static void main(String[] args) {
        //Sorting an array based on natural ordering
        Arrays.sort(names);

        //Sorting a list using Collections api
        Collections.sort(nameList);

        System.out.println("Sorted array values");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Sorted list values");
        for(String string : nameList) {
            System.out.println(string);
        }

        Rand rand = new Rand();
        rand.setName("ram");
        rand.setAge(12);

        rand.setName("aam");
        rand.setAge(32);

    }
}

class Rand implements Comparable<Rand>{
    String name;
    int age;

    public Rand() {
    }

    public Rand(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Rand rand) {

        String compareEntity = rand.getName();
        return this.name.compareTo(compareEntity);
    }
}