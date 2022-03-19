package Lesson7;

import java.util.Random;

// masiv1- 50 elementov,i zapolnitj slu4ainimi celimi 4islami
public class ClassWork {
    public static void main(String[] args) {
        printArray(getArray());
      //    Random rnd = new Random();
//
 //          int i = rnd.nextInt();// generacija slu4ainogo celogo 4isla ot min do max celogo 4isla(tipa integer)
   //       i = rnd.nextInt(43);// generiruet 4isla ot 0-43


     //    int[] array0 = new int[i];

       //   for (int j = 0; j < array0.length; j++) {

         //   array0[j] = rnd.nextInt();
           //  System.out.print(array0[j] + " ");
    //}

     }
    public static int[] getArray() {
        Random rnd = new Random();
        int i;
        do {

            i = rnd.nextInt(50);
        } while (i < 2);
        int[] array = new int[i];
        for (int j = 0; j < array.length; j++) {
            array[j] = rnd.nextInt(25);
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