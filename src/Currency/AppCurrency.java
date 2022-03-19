package Currency;

public class AppCurrency {
    public static void main(String[] args) {
        //" USD 100 "
        //" EUr 130"
        // RUB 1500"

        // Currency´- USD , AMOUNT _ 100"

        Currency cur =new Currency("USD 100");
         Currency cur1= new Currency("USD 100");
         Currency cur2 = new Currency("CHY 3495");
        // Currency cur3= new Currency("CHY 100 ");
      // System.out.println(cur1);
        System.out.println(cur2.getRur());
       // System.out.println(cur3.getRur());
    }
}
