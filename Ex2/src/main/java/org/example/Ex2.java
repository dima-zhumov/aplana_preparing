package org.example;

import java.util.Scanner;


public class Ex2
{
    public static void main( String[] args )
    {
        final int constX = 1;
        final int constY = 5;
        final int constZ = 10;

        System.out.println("Введи число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();

        if ((number == constX) || (number == constY) || (number == constZ)) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }

    }



}
