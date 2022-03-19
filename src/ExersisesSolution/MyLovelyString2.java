package ExersisesSolution;

public class MyLovelyString2 {
    // Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
/// При задании строки четной длины возвращается первая половина. Таким образом, строка "WooHoo" возвращает "Woo".
    public static void main(String[] args) {

        firstHalf("WooHoo");
        firstHalf("HelloThere");
        firstHalf("abcdef");

    }

    public static void firstHalf(String input) { // <---- input polu4aem polovinu stringa
        int half = input.length() / 2;
        String result = input.substring(0,half);
        System.out.println(result);
    }

}
