package ExersisesSolution;

public class MyLovelyStringSol {
   // Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out
   // string, e.g. "<>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

    //. Если дана строка "out" длиной 4, например, "<<>>", и слово, верните новую строку, в которой слово находится в середине строки "out".
    //например, "<>". Примечание: используйте str.substring(i, j) для извлечения строки, начинающейся с индекса i и продолжающейся до индекса j, но не включая его.

    public static void main(String[] args) {
        makeOutWord("<<>>", "Yay");
        makeOutWord("<<>>", "WooHoo");
        makeOutWord("[[]]", "word");
    }
    public static void makeOutWord(String input,String output){
        String result = output.substring(0,2)+input+output.substring(2);
        System.out.println(result);
    }
}
