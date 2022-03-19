package Lesson10Arrays;

import java.util.Arrays;
import java.util.Random;
//Заполнить массив из пятнадцати элементов случайным образом целыми значениями, лежащими в диапазоне от 0 до 10 включительно


public class RandomArrayFill {               // <------
    public static void main(String[] args) {
        Random rnd = new Random();              // Randomnaja peremenaja
        int i = rnd.nextInt(50);    //<-----
        System.out.println(i);

        int[] array = new int[rnd.nextInt(50)];
        for (int j = 0; j < array.length; j++) {
            array[i] = rnd.nextInt();
            
        }
        System.out.println(Arrays.toString(array));



    }





}
