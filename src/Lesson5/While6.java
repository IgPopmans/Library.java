package Lesson5;

public class While6 {
   //Найти сумму всех чисел от min до max c шагом step
   //min=10
   //max=100
   //step=20
   ////250
    public static void main(String[] args) {
        int a = 10;
        while (a < 100) {
            System.out.print(a + " ");
            a += 20;
        }
    }
}