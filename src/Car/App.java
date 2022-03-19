package Car;

public class App {
    public static void main(String[] args) {
        Auto car = new Auto();
        car.manufacturer="BMW";
        car.model="X5";
        car.color="Silver";
        car.wheels= 5;
        car.years=2020;

       Auto car2 = new Auto("Black","D15506","Ford","Focus", 5, 2018);
        System.out.println(car2);
        Auto car3= new Auto("M2408","BmW","X5",4);
        System.out.println(car3);
    }
}

