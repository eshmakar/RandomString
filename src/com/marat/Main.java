package com.marat;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Kelvin");
        hashSet.add("Tom");
        hashSet.add("Михаил");
        hashSet.add("Evgenii");
        hashSet.add("Bob");
        hashSet.add("Pavel");
        hashSet.add("Адам");
        hashSet.add("Leon");


            System.out.println(hashSet.contains("Адам"));

    }
}