package Lesson10Arrays;

import java.util.Arrays;
import java.util.Random;

//Заполнить массив из пятнадцати элементов случайным образом целыми значениями, лежащими в диапазоне от 0 до 10 включительно

public class NewArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray()));

    }
     public static int[] getArray() {
        Random rnd = new Random();
        int i;
     do {
        i = rnd.nextInt(15);
     }while (i < 2);
    int[] array = new int[i];
    for (int j = 0; j< array.length;j++){
        array[j] = rnd.nextInt(10);
    }
    return array;
    }

}



