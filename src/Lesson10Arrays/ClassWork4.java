package Lesson10Arrays;

//В массиве хранится информация о баллах, полученных спортсменом-десятиборцем в каждом из десяти видов спорта.
// Для выхода в следующий этап соревнований общая сумма баллов должна превысить некоторое известное значение.
// Определить, вышел ли данный спортсмен в следующий этап соревнований

public class ClassWork4 {
    public static void main(String[] args) {
        int[]array = {5,7,6,7,8,9,5,6,6,7};
        int point = 87;
        System.out.println(isNext(point,array));


    }

    public static int getSum (int []arrayX){
        int sum = 0;
        for (int i = 0; i < arrayX.length; i++) {
           sum=sum + arrayX[i];     // toze samoe,---->>><   sum+=arrayX[i]

        }
        return sum;
    }
    public static boolean isNext(int x,int[] arrayX){
        return getSum(arrayX)>x;
    }
}
