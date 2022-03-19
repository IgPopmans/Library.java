package Lesson1309;
//Составить функцию, "рисующую" на экране горизонтальную линию из 80 символов "*"
public class LineTask {
    public static void main(String[] args) {
        printDiagonal(10);
      // printLine(80);
    }
    public static void printLine(int x){
        for (int i = 0; i <x ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printDiagonal(int y){
        for (int i = 0; i < y; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");

            }
            System.out.println("*");
        }

    }
}
