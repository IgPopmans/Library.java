public class Exsises {

    public static void main(String[] args) {
        firstHalf("WooHoo");// → "Woo"
        firstHalf("HelloThere");// → "Hello"
        firstHalf("abcdef");// → "abc"

    }

    public static void firstHalf(String input) {
        int half = input.length() / 2;
        String result = input.substring(0, half);
        System.out.println(result);
    }
}