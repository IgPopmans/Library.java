package Lesson_6;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {6, 13, 12, 42, 48, 84, 23, 17, 76};
        double average = 0;
        double sum = 0;

        if (numbers.length > 0) {

            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            average = sum / numbers.length;

            System.out.println("среднее арифметическое чисел равно: " + sum / numbers.length);
        }

    }
}