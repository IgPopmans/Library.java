package Lesson09;
import java.util.Arrays;
import java.util.Random;

class HomeArray {


    public static void main(String[] args) {
        int [][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i)*(j);


            }

            System.out.println("=======");
        }
        //
         System.out.println(Arrays.deepToString(array));
    }


}

