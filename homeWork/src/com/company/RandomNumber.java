package com.company;

import java.util.Random;

public class RandomNumber {
    Random random = new Random();

    public void firstRandomNumbers() {
        long i = random.nextLong();
        System.out.println(i);
    }

    public void secondRandomNumbers() {
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            long d = random.nextLong();
            System.out.println(d);
        }
    }

    public void thirdRandomNumbers() {
        int min = 0;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            int d = random.nextInt(diff + 1) + min;
            System.out.println(d);
        }
    }

    public void fourthRandomNumbers() {
        int min = 20;
        int max = 50;
        int diff = max - min;
        Random random = new Random();
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            int d = random.nextInt(diff + 1) + min;
            System.out.println(d);
        }
    }

    public void fifthRandomNumbers() {
        int min = -10;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            int d = random.nextInt(diff + 1) + min;
            System.out.println(d);
        }
    }

    public void sixthRandomNumbers() {
        int countMin = 3;
        int countMax = 15;
        int countDiff = countMax - countMin;
        int min = -10;
        int max = 35;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(countDiff + 1) + countMin;
        int[] number = new int[i];
        for (i = 0; i < number.length; i++) {
            int d = random.nextInt(diff + 1) + min;
            System.out.println(d);
        }
    }
}
