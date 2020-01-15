package org.example;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи текущий курс");
        double kurs=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введи количество рублей");
        double rubl=scanner.nextDouble();
        scanner.nextLine();
        double dollar = rubl/kurs;
        double okrugl = (double) Math.round(dollar * 100) / 100;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println(f.format(okrugl));
    }
}
