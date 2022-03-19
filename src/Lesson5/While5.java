package Lesson5;

public class While5 {
    //Необходимо вывести на консоль числа от числа "max" до числа "min" с шагом "step".
    //min=10
    //max=100
    //step=10
    ////100 90 80 70 60 50 40 30 20 10

    public static void main(String[] args) {
        int a = 100;
        while (a >= 10) {
            System.out.print(a + " ");
            a -= 10;
        }
    }
}