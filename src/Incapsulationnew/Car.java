package Incapsulationnew;

public class Car {
    public String color;
    public String number;
    public String manufacturer;
    public String model;
    public int wheels = 5;
    public int years = 2030;
    public int run = 0;

    public Car() {
    }

    public Car(String color, String number, String manufacturer, String model, int wheels, int years, int run) {
        this.color = color;
        this.number = number;
        this.manufacturer = manufacturer;
        this.model = model;
        this.wheels = wheels;
        this.years = years;
        this.run = run;
    }
}
