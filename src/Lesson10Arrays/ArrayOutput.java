package Lesson10Arrays;

public class ArrayOutput {
    public static void main(String[] args) {
//Вывести элементы массива на экран в обратном порядке

        int[] array = { 1, 3, -7, 2, 8, 23, 21, 54, 4, 5 };

        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
            }
        }
    }
