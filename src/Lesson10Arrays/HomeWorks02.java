package Lesson10Arrays;

public class HomeWorks02 {


    //uveli4itj elemeti masiva v 2 raza


    public static void main(String[] args) {
       // int[] arrayX = {2, 4, 7, 5, 9, 11};

       // for (int i = 0; i < arrayX.length; i++) {

            //arrayX[i] *= 2;
           // System.out.println(arrayX[i]);
        //}

//Дан массив целых чисел. Напечатать все четные (по значению) элементы

//Использовав вложенный цикл напечатать таблицу сложения десятков (10 20 30 40 ... 90


//        for (int i = 10; i < 100; i+=10) {
//            for (int j = 10; j< 100; j+=10){
//                System.out.print(i + j + "\t");
//            }
//            System.out.print("\n");
//        }
        //Найти среднее арифметическое элементов массива, больших числа 10
        //
         int [] array = new int[]{8, 13, -5, 19, 1, 10, 25, 4, -48, 13, 26, 98, 44, 77, 7, 17, 37};
       // int[] array={-5, 8, 10, 0, 4, -100};
        int sum = 0;
        int count = 0;
        for (int i = 0; i< array.length ; i++) {
            if (array[i] > 10){
                sum += array[i];
                count++;

            }



        }
        if (count == 0){
            System.out.println(" Vi4islenie ne vozmozno");
        }else {
            System.out.println((double) sum/count);
        }


    }

}
