package Lesson04;


//К родителям Васи Сидорова приехала Бабушка и сказала, что родители не умеют воспитывать сына и она сама знает,
//когда давать ребёнку деньги. Напишите программу выдачи денег Васе, если бабушка выдаёт деньги независимо от
//решения родителей.
//verySmartDepositBoxVersionThree(mamaPermission, papaPermission, omaPermission)


public class haveaSolutionbox {
    public static void main(String[] args) {
        boolean mamaPermission = false;
        boolean papaPermission = false;
        boolean omaPermission = true;


        System.out.println(verySmartDepositBoxVersionThree(mamaPermission, papaPermission, omaPermission));

    }
    public static boolean verySmartDepositBoxVersionThree(
            boolean mama, boolean papa , boolean oma) {
        return (mama && papa) || oma;
    }

}
