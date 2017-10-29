package com.plusonetesting.section9.arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] intArray = getIntegers(5);

        System.out.println(getAverage(intArray));

    }

    private static int[] getIntegers(int number) {

        Scanner intScanner = new Scanner(System.in);
        int[] ints = new int[number];
        int i;

        System.out.println("Enter " + number + " numbers:\r" );

        for (i=0; i<number; i++) {
            ints[i] = intScanner.nextInt();
        }
        return ints;
    }

    private static double getAverage(int[] intArray) {
        int sum = 0;

        for (int i:
             intArray) {
            sum += i;
        }

        return (double) sum / (double) intArray.length;
    }


}
