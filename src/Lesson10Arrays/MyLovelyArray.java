package Lesson10Arrays;

public class MyLovelyArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

            }
        }
    }

