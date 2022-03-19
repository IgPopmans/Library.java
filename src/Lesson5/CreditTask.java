package Lesson5;

public class CreditTask {
    //Маша выдает в месяц 50 кредитов.
    //Петя выдает на 20% меньше кредитов чем Маша.
    //Вася в хорошем настроении выдает столько же сколько и Маша. В плохом настроении выдает в два раза меньше, чем Маша.
    //У Василия настроение улучшается только после того, как будет выдано в общем больше, чем 1370 кредитов. Пока выдано меньше, настроение у Васи плохое.
    //Вопрос:
    //1.сколько месяцев понадобится, чтобы выдать в общем 2100 кредитов.
    //2.сколько кредитов будет выдано в общем за 16 месяца.





    public static void main(String[] args) {
        double masha = 50;
        double petr = masha - masha * 0.2;
        double vasOk = masha;
        double vasNotOk = masha * 0.5;
        double creditSum = 0;
        int month = 1;
        while (creditSum <= 2100){
            month = month +1;
            if (creditSum > 1370) {
                creditSum = creditSum + masha + petr + vasOk;
            }
            else {
                creditSum = creditSum + masha + petr + vasNotOk;
            }
        }
        System.out.println(month);

        month = 1;
        creditSum = 0;
        while (month <=16) {
            month = month +1;
            if (creditSum > 1370) {
                creditSum = creditSum + masha + petr + vasOk;
            }
            else {
                creditSum = creditSum + masha + petr + vasNotOk;
            }
        }
        System.out.println(creditSum);

    }
}
