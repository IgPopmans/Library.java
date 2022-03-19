package Lesson1309;
// proizvoljnij masiv ,celih 4isel,naiti indeks 4isla, libo -1 ,esli 4isla net
public class MyLovelyArray {
    public static void main(String[] args) {
        int[] arrayX ={14, 16, 56, 43, 23, 27, 71};
        int x = 43;
        System.out.println(findIndex(x, arrayX));
    }
    public static int findIndex(int y,int[] arrayX){
        for (int i = 0; i < arrayX.length; i++) {
            if (arrayX[i]== y){
                return i;

            }

        }
        return -1;
    }
}
