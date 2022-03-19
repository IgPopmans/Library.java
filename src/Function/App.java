package Function;

public class App {
    private static Object b;

    public static void main(String[] args) {
        // Pos4itatj i vivesti na komsolj kvadrati 4isel 1 do 10
        for (int i = 1; i < 10; i++) {
            System.out.println(i * i);
        }
       // printSquareNumbers(1, 10);
      //  System.out.println(getSquareNumber(22));//
  printNumber(1000);




    }
    private static void printSquareNumbers(int min, int max) { // Funkcija dlja pods4eta Ploswadi , ee mi posilaem v funkcoju PrintNumber ,4tobi raspe4atatj na konsole
        for (int i = min; i < max; i++) {
            printNumber(getSquareNumber(i));
        }


    }

    private static void printNumber(int integerNumber) { // Funkcija dlja raspe4atki
        System.out.println("Kakoe zame4atejnor 4islo" +" " + integerNumber);

    }

    private static int getSquareNumber(int i) {

        return i * i;

    }

    }


