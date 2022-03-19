package Lesson10Arrays;

public class DobArray {

    //Использовав вложенный цикл напечатать таблицу умножения


    public static void main(String... args) {

        int[] arrayX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arrayX) {
            for (int j : arrayX) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }
    }
}