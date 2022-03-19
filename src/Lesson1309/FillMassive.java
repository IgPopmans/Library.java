package Lesson1309;

public class FillMassive {
    public static void main(String[] args) {



        int [][] arrayX = new int[10][10];
        for (int i = 0; i < arrayX.length  ; i++) {
            for (int j = 0; j <arrayX[i].length ; j++) {
                arrayX[i][j] = i*j;

            }


        }
        System.out.println(getResult(9, 9, arrayX));


    }
    public static int getResult(int i,int j, int[][] arrayX){
        return arrayX[i][j];
    }
}
