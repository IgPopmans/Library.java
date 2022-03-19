package ExersisesSolution;
//Вырезать из выражения "Вход разрешён" последние 8 символов и добавить "воспрещён".
public class SubString {
    public static void main(String[] args) {
//       String s1 = "Вход разрешён";
//       String s2 =s1.substring(0,5);
//        System.out.println(s2 + "воспрещён");
//    }
    getP();
    restSubstring();
    }



    public static void getP() {
        String input = "and a word,";
        System.out.println(input.toUpperCase());


    }
    public static void restSubstring(){
        String input = "ABra Kadabra";
        System.out.println(input.substring(3));
      


    }
}