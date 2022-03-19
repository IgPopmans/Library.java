package Lesson8;

public class Polindrom {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4,5,4,3,2,1};// polindrom
        int[] array2 = new int[]{1,2,3,4,5,6,4,3,2,1}; // No
        isPalindrome(array1);
        isPalindrome(array2);

    }

    private static void isPalindrome(int[] array) {
        boolean isPal =true;
        for (int i = 0; i<= array.length /2;i++) {

            if (array[i]!=array[array.length - 1 -i]){
               isPal = false;
               break;


            }
        }
        if (isPal){
            System.out.println(" Eto palindrome");

        }else{
            System.out.println(" Eto ne palindrome");
        }

    }


}

