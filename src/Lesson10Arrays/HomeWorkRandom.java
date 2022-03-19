package Lesson10Arrays;

import java.util.Random;

public class HomeWorkRandom {
    public static void main(String[] args) {
        printArray(getArray());

    }
    public static int[] getArray() {
        Random rnd = new Random();
        int i;
        do {

            i = rnd.nextInt(15);
        } while (i < 2);
        int[] array = new int[i];
        for (int j = 0; j < array.length; j++) {
            array[j] = rnd.nextInt(10);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("=============");
        for (int i : array) {
            System.out.print(i + " \t");

        }
        System.out.println("\n===============");
    }
}

