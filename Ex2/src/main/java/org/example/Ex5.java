package org.example;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Введи строку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2=str.replaceAll(" ","");
        System.out.println(str2);
    }
}
