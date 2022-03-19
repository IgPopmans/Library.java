package Lesson8;

public class LuckyTicket {
    public static void main(String[] args) {

        int[] array = {3, 7, 8, 5, 9, 4 };
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < array.length / 2; i++) {
            sum1 = sum1 + array[i];

        }
        for (int i = array.length / 2; i < array.length; i++) {
            sum2 = sum2 + array[i];

        }
        if (sum1 == sum2) {
            System.out.println("Lucky Ticket");
        }else{
                System.out.println("Unlycky Ticket");

            }
        }
    }