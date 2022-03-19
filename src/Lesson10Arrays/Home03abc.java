package Lesson10Arrays;

public class Home03abc {

    //Вывести на экран все целые числа от a до b, кратные некоторому числу c.



    public static void main(String[] args) {
          int a = 0;
          int b = 0;
          int c = 0;
         int[] arrayX = {2, 4, 7, 50, 9, 11};

        for (a = 0; b < arrayX.length; a++) {

        arrayX[a] %= 2;
        
        System.out.println(arrayX[a]);
        }

    }


    }

