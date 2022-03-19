package Lesson8;

import java.util.Arrays;

public class FillMassive {
    public static void main(String[] args) {


        int[] array =  {37, 0, 50, 46, 34, 46, 0, 13};

            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;


            }
        System.out.println(Arrays.toString(array));

    }
}