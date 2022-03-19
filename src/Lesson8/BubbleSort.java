package Lesson8;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{97, 55, 86, 73, 24, 13, -35, 1, -15};
        System.out.println(Arrays.toString(array));
        System.out.println("==============");
        bubbleSort(array);

    }

    public static void bubbleSort(int[] array) {
        for (int j = 0; j<array.length -1; j++){

            for (int i = 0; i < array.length - 1 - j; i++) {

                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }


            }
            System.out.println(Arrays.toString(array));
        }

    }

}