package com.na.collections.map;

import java.security.KeyStore.Entry;
import java.util.Set;
import java.util.TreeMap;

public class App105 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> TreeMap= new TreeMap<>();

        TreeMap.put(6, 'A');
        TreeMap.put(5, 'B');
        TreeMap.put(1 , 'C');
        TreeMap.put(2 , 'D');
        TreeMap.put(8 , 'E');

        Set<Entry>Integer, Character>> setTreeMap= TreeMap.entrySet();

        System.out.println("các entry có trong setTreeMap:");
        System.out.println(setTreeMap);
    }
}