package org.example;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Введи количетсво строк");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введи количетсво столбцов");
        int b = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix;
        matrix = new int[a][b];

        System.out.println("Введи "+a*b+" элемента(-ов) матрицы");
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                matrix[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }
        System.out.println("Вывод первой строки матрицы, где каждый элемент умножен на 3");
        for (int j=0;j<b;j++){
            System.out.print(matrix[0][j]*3+"; ");
        }

    }

}
