package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи первую строку");
        String str1 = scanner.nextLine();
        System.out.println("Введи вторую строку");
        String str2 = scanner.nextLine();

        if (str1.length()>str2.length()) {
            System.out.println(str1);
        }
        else if (str1.length()<str2.length()){
            System.out.println(str2);
        }
        else {
            System.out.println("Длины строк равны");
        }
    }
}
