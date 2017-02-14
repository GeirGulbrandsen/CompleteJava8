package com.plusonetesting.misc;

public class Misc {

    public static void main(String[] args) {
//        int i;
//        int runs = 10000;
//        int count = 0;
//        int answer = 0;
//
//        for (i = 0; i < runs; i++) {
//            Random rn = new Random();
//            answer = rn.nextInt(10)+1;
//            if (answer == 6) {
//                count++;
//            }
//        }
//        System.out.println(count);

        int number = 5;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number: " + number++);
            count++;
            if (count >= 5) {
                break;
            }
        }
        System.out.println("Event numbers found = " + count);
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}
