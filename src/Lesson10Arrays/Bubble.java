package Lesson10Arrays;


import java.util.Arrays;


public class Bubble {
    public static void main(String[] args) {
        int[] array = new int[]{97, 55, 86, 73, 24, 13, -35, 1, -15}; // ZAPOLNENIE MASIVA
        for (int i = 0; i < args.length ; i++) {
            array[i] = i +1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array[3] + " " + array[4]+ array[6]); // Raspe4atatj InDEksi MASIVa
    }




//        System.out.println("======================");
//       bubbleSort(array);
//      //  bubbleSortFromSmall(array);
//        System.out.println(Arrays.toString(array));
//    }


//    public static void bubbleSortFromSmall(int[] array) {
//        for (int j = 0; j < array.length - 1; j++) {
//            for (int i = array.length - 1; i > j; i--) {
//                if (array[i] < array[i - 1]) {
//                    int tmp = array[i];
//                    array[i] = array[i - 1];
//                    array[i - 1] = tmp;
//                }
//            }
//            System.out.println(Arrays.toString(array));
//        }
//
//        public static void bubbleSort ( int[] array){
//
//            for (int j = 0; j < array.length - 1; j++) {
//                for (int i = 0; i < array.length - 1 - j; i++) {
//                    if (array[i] > array[i + 1]) {
//                        int tmp = array[i];
//                        array[i] = array[i + 1];
//                        array[i + 1] = tmp;
//                    }
//                }
//                System.out.println(Arrays.toString(array));
//            }
//
//
//        }

    }
