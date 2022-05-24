package com.na.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App85 {
  public void main(String[] agrs) {
      HashMap<String, String>hashMap=new HashMap<>();
        
      hashMap.put("CSLT","cơ sở lập trình");
      hashMap.put("C++","c++");
      hashMap.put("C#","C Sharp");
      hashMap.put("php","php");
      hashMap.put("java","java");

      Set<Map.Entry<String, String>> sethashMap=hashMap.entrySet();
    
      System.out.println("các entry có trong sethasMap");
      System.out.println(sethashMap);
    }

}