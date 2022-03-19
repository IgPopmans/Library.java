package Lesson10Arrays;

//Дан массив целых чисел. Выяснить является ли s-й элемент массива положительным числом
//Дан массив целых чисел. Выяснить является ли k-й элемент массива четным числом
public class ClassWork {
    public static void main(String[] args) {
        int[] array = new int[] {23,14,-12,43,56,87,78,54};
      //  System.out.println(array[2]);
//        if (array[2]>=0){
//            System.out.println("+++");
//        }else {
//            System.out.println(" otricateljnoe");
//        }
        System.out.println(isEven(2,array));
        System.out.println(isPositive(4,array));
        System.out.println(isNegative(2,array));
       // System.out.println(array[2]>=0);
    }
   public static boolean isPositive(int x ,int[]array){
       if (array[x]>=0){
           return  true;
       }else {
           return false;
       }
    }


public static boolean isNegative(int x , int[]array){
    return array[x]<0;
}
//Дан массив целых чисел. Выяснить является ли k-й элемент массива четным числом
public static boolean isEven(int x, int[]array){
        return array[x]% 2==0;                      // == strogoe ravenstvo,!= strogoe neravenstvo
}
}
