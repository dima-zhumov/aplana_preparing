package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число в бинарном виде");
        int value=scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> array = new ArrayList<>();
        do {
            array.add(value%10);
            value=value/10;
        }
        while (value>0);

        int result=0;
        for (int i=0; i<array.size(); i++) {
            result= (int) (result + array.get(i)*Math.pow(2,i));
        }
        System.out.println(result);
    }
}
