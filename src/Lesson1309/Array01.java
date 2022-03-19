package Lesson1309;
//,naiti 4islo 2 , poslednij indeks masiva
public class Array01 {



    public static void main(String[] args) {
        int [] arrayX = {23,48,12,2,5,9,10,37,2,18,25};
        int a =2;
        System.out.println(lastIndex(2, arrayX));
        System.out.println(lastIndexOfTwo(100, arrayX));

    }

    public static int lastIndexOfTwo(int i,int[] arrayX){
        int max =-1;
        for (int j = 0; j < arrayX.length; j++) {

            if(arrayX[j]==i){
                max=j;

            }

        }
        return max;
    }


    public static int lastIndex(int y,int[]arrayX){
        for (int i = arrayX.length -1; i>0 ; i++) {
            if(arrayX[i]==y){
                return i;
            }



        }
        return -1;
    }
}
