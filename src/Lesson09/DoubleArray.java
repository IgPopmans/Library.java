package Lesson09;

public class DoubleArray {
    public static void main(String[] args) {


    int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};//объявили массив и заполнили его элементами
    for (int i = 0; i < 3; i++) {  //идём по строкам
        for (int j = 0; j < 4; j++) {//идём по столбцам
             twoDimArray[i][j] = (i+j)% 5;


                System.out.print(" " + twoDimArray[i][j] + " "); //вывод элемента
        }
        System.out.println(" ");//перенос строки ради визуального сохранения табличной формы
    }


    }

}