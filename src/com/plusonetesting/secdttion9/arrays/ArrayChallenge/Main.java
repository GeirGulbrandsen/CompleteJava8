package com.plusonetesting.secdttion9.arrays.ArrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] originalInts = getIntegers(5);

        printArray(originalInts);
        printArray(sortArray(originalInts));


    }

    private static int[] sortArray(int[] originalInts) {
        int[] sortedArray = Arrays.copyOf(originalInts, originalInts.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
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
