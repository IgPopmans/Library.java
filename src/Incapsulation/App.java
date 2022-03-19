package Incapsulation;

public class App {
    public static void main(String[] args) {
        Cat mursik = new Cat("Mursik");
        System.out.println(mursik.seePassport());
        mursik.newYear();
        System.out.println(mursik.seePassport());
        mursik.pusico();
}
}