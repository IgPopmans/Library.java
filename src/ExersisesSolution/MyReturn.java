package ExersisesSolution;

public class MyReturn {
    public static void main(String[] args) {
getAdd(7,8);
getResult(56,23);

    }

    public static int getAdd(int a, int b) { // Eta funkicja ni4ego ne vozvrawaet,ne kuda vozvrawatj

        return a + b;

    }
public static void getResult(int c,int f){
    System.out.println(c*f);                      // funkcija funkcionaljnaja peredajetsa v main ,gde prinimaet ljubie parametri
}
}