package com.na.collections.set;

import java.util.HashSet;
import java.util.Scanner;

public class App55 {
    public static void main(String[] args) {
    String name;
    HashSet<String> hashSetString = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    hashSetString.add("wilson");
    hashSetString.add("Nike");
    hashSetString.add("volvo");
    hashSetString.add("Kai");
    hashSetString.add("Lenovo");
    hashSetString.add("Lenovo");

    System.out.println("các phần tử trong hashSetString:" );
    System.out.println(hashSetString);
    System.out.println("Nhập phần tử cần xóa :");
    name = scanner.nextLine();

    if(hashSetString.contains(name)) {
        hashSetString.remove(name);
        System.out.println("xóa thành công"); 
        System.out.println("các phần tử còn lại trong hashSetString:");
        System.out.println(hashSetString);
    }else{
        System.out.println("xóa không thành công!");
    }
 }
}