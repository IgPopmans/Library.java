public class Exsices {
    public static void main(String[] args) {
        makeOutWord("<<>>", "Yay");//→ "<<Yay>>"
        makeOutWord("<<>>", "WooHoo");// → "<<WooHoo>>"
        makeOutWord("[[]]", "word");// →"[[word]]"

    }

    public static void makeOutWord(String out, String input) {
        String result = out.substring(0,2)+input + out.substring(2);
        System.out.println(result);

    }
}
