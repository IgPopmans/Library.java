package Lesson10Arrays;

public class DoubleElement {
    public static void main(String[] args) {


        //Дан массив. Все его элементы увеличить в 2 раза

            int array[] = {1, 2, 3, 4, 5, 6, 7, 12, 66, 34, 2, 5, 34};
            int length = array.length;

            for (int i = 0; i < length; i++) {

                    array[i] *= 2;


                System.out.println(array[i]);
            }


        }
    }