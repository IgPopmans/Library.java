package lesson01;

public class CurrencyConverter {
    public static void main(String[] args) {
        dollarToEuro(29040);

    }

    public static void dollarToEuro(double moneyUsd) {
        double result = moneyUsd / 1.2;
        System.out.println("euro " + result);

    }
}