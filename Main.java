package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[20];
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()* 100);
            System.out.print(array[i] + " ");
            s = s + array[i];


        }
        System.out.println();
        System.out.println(s);
        Chek(s);

    }
     public static void Chek(int s) {
        if (s%2 == 0) {
            System.out.println("ЧЕТНО");
        } else {
            System.out.println("НЕЧЕТНО");
        }



    }
}










