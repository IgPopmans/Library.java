package Lesson8;

import java.util.Arrays;
public class BubbleSortAnother {
    public static void main(String[] args) {
        int[] array = new int[]{97, 55, 86, 73, 24, 13, -35, 1, -15};
        System.out.println(Arrays.toString(array));
        System.out.println("======================");
        System.out.println("?????????????");
        System.out.println("````````````````");
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {          // vnewnij cikl
            for (int i = array.length - 1; i > j ; i--) {     // Vnutrenij cikl
                if (array[i] < array[i - 1]) {                 // sna4ala idem po vnewnemu ciklu ,poka vipolnjaetsa
                    int tmp = array[i];                         // USLOVIE ;POTOM ZAHODIM VO VTOROJ ,
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

}
