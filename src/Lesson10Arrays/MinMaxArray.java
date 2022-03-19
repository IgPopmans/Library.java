package Lesson10Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
       // FUNKCIJA VOZVRAWEAET MINIMALJNOE 4islo v MASIVe

        int[] arrayY = new int[]{25, 56, 75, 85, 98, 120};

        int min = getMin(arrayY);             // Metod GetMIN
        System.out.println("Minimum ist " + min); //METOD Getmin


        int max = getMax(arrayY);                  // Metod GetMax
        System.out.println("Maximum ist" + max);  // Metod Get MAX
    }
//FUNKCIJA VOZVRAWEAET MAKSIMALJNOE 4islo v MASIVe
    public static int getMax(int[] arrayY) {
        int result = arrayY[0];

        for (int i = 0; i <arrayY.length ; i++) {
            if (result< arrayY[i]){
                result = arrayY[i];

            }
        }
    return result;
    }
public static int getMin(int[] arrayY){
        int result = arrayY[0];
    for (int i = 0; i <arrayY.length ; i++) {
        if(result> arrayY[i]){
            result = arrayY[i];
        }
        

    }
    return result;
    }
 public  static double getSum(int[] arrayY){        // UNIVERSALJNij METOD
        double result =0;
        for (int i : arrayY){
            result+=i;
        }
        return result;
 }

 public static double getAverage(int[] arrayY){  // universaljnij metod srednego arivmeti4eskogo
        return getSum(arrayY)/ arrayY.length;
 }

}


