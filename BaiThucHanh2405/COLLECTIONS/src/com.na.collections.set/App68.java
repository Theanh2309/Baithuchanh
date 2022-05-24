package com.na.collections.set;
import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

public class App68 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treesetInteger= new Treeset<>();
        Scanner scanner= new Scanner(System.in);

        treesetInteger.add(0);
        treesetInteger.add(3);
        treesetInteger.add(4);
        treesetInteger.add(2);
        treesetInteger.add(8);

        System.out.println("các phần tử trong hashSetString:" );
    System.out.println(treesetInteger);
    System.out.println("Nhập phần tử cần thêm :");
    number = scanner.nextInt();

    if(treesetInteger.contains(number)) {
        treesetInteger.remove(number);
        System.out.println("thêm thành công"); 
        System.out.println("các phần tử còn lại trong hashSetString sau khi thêm:");
        System.out.println(treesetInteger);
    }else{
        System.out.println("phần tử"+ number +"đã tồn tại!");
    }
 }
}
