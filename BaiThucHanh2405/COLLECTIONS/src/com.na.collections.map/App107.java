package com.na.collections.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App107 {
    public static void main(String[] args) {
    TreeMap<Integer, Double>TreeMap=new TreeMap<>();
    TreeMap.put(1, 9d);
    TreeMap.put(4, 10.1d);
    TreeMap.put(2, 7.2d);
    TreeMap.put(8, 20.28d);

    System.out.println("các phần tử có trong treeMap:");
    Set<Map.Entry<Integer,Double>>setTreemap=TreeMap.entrySet();
    System.out.println(setTreemap);

    TreeMap.replace(4, 20.11d);

    TreeMap.replace(2, 7.7d);

    System.out.println("các phần tử có trong treeMap sau khi thay thế:");
    setTreemap= TreeMap.entrySet();
    System.out.println(setTreemap);
   
}

}