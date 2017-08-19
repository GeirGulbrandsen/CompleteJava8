package com.plusonetesting.secdttion9.arrays.ArrayChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] originalInts = getIntegers(5);

        printArray(originalInts);
        printArray(sortArray(originalInts));


    }

    private static int[] sortArray(int[] originalInts) {
        int[] sortedArray = new int[originalInts.length];


        return new int[0];
    }

    private static void printArray(int[] intArray) {
        for (int i :
                intArray) {
            System.out.println(i);
        }
    }

    static int[] getIntegers(int numberOfInts) {

        int[] intArray = new int[numberOfInts];
        Scanner inputInts = new Scanner(System.in);

        for (int i = 0; i < numberOfInts; i++) {
            intArray[i] = inputInts.nextInt();
        }

        return intArray;
    }
}
