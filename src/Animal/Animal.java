package Animal;

public class Animal {


    public int weight;
    public String color;
    public int height;
    public int speed;

    public Animal(String color, int height) {
        this.color = color;
        this.height = height;
    }

    public Animal(){

    }

    public Animal(int weight, String color, int height, int speed) {
        this.weight = weight;
        this.color = color;
        this.height = height;
        this.speed = speed;
    }






    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", speed=" + speed +
                '}';
    }
}
