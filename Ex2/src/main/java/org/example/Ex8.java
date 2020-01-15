package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
    //Сортировка выбором
        System.out.println("Введи количество элементов массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        int array[]=new int[size];
        System.out.println("Введи "+ size + " элемента(-ов) массива");
        for (int i = 0; i < size;i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < array.length-1; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int value = array[i];
            array[i] = min;
            array[minId] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
