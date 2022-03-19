package Lesson_6;
//* naiti "minimaljnoe" ,"maksimaljnoe","sredne" arifmeti4eskoe 4islo v masive, 4islo double,
public class ClassWork {
    public static void main(String[] args) {
        int[] integerArray;
        integerArray= new int[]{2,4,6,8,10,12,100};

        System.out.println(getSum(integerArray));

    }
    public static int getSum(int[] integerArray){
        int result = 0;

        for (int i = 0;i< integerArray.length;++i )
        {
            result += integerArray[i] ;

        }

            return result;

    }
}

