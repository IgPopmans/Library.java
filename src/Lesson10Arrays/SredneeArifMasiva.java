

public class SredneeArifMasiva {

   //Дан массив. Составить программу расчета среднего арифметического двух любых элементов массива
    public static void main(String[] args) {
        int[] array = new int[]{45, 78, 23, 90, 43, 49, 81,98};
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            i +=array[j];

        }
        System.out.println(i);
        System.out.println((double) i / array.length);
        System.out.println(1*1.0 / array.length);
    }
}
