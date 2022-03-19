package Lesson5;

public class SpeedPenalty {
    public static void main(String[] args) {
        policemen( 50);
        policemen( 64);
        policemen( 98);

        policemen(129);
        policemen(250);

    }
        public static void policemen(int speed){


            if(speed== 50) {
                System.out.println("нарушений нет");
            //за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
            }else if (speed <= 65){
                System.out.println(" устное порицание и лекция на 5 минут");
            //за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
            }else if (speed <=99) {
                System.out.println("40 евро штрафа");

                }else if (speed <=130) {
                System.out.println(" штраф 500 евро");
            }else {
                System.out.println("штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного\n" +
                        "средства.");
            }
        }
}
