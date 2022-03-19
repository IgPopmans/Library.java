package Lesson5;

public class WhileH4 {
    //вывести на консоль числа от числа "min" до числа "max" с шагом "step".
    ////10 20 30 40 50 60 70 80 90 100

    public static void main(String[] args) {
        int a = 10;
        while (a <= 100) {
            System.out.print(a + " ");
            a += 10;
        }
    }
}