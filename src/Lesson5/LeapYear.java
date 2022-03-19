package Lesson5;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(findLeapYear(2000));
        System.out.println(findLeapYear(2001));

    }
    public static boolean findLeapYear(int year) {
        return year % 4 == 0;
    }
}
