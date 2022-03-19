package Lesson10Arrays;

//Найти сумму положительных нечетных чисел, меньших 50.

public class ArraySum {
    public static void main(String[] args) {

        int[] array= new int[100];
        int summ = 0;
        for (int i =1; i <= 50; i+=2)
            summ += i;

        System.out.println("======" + " " + summ);

    }





}

