package org.example;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int [] array = {3,0,12,10,15,7};

        boolean flag = false;
        int value;
        while(!flag) {
            flag = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    flag = false;
                    value = array[i];
                    array[i] = array[i+1];
                    array[i+1] = value;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
