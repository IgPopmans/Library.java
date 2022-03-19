package Car;

public class Auto {


    public String color;
    public String number;
    public String manufacturer;
    public String model;
    public int wheels=5;
    public int years=2030;
    public int run = 0;

    public Auto(String color, String number, String manufacturer, String model, int wheels, int years) {
        this.color = color;
        this.number = number;
        this.manufacturer = manufacturer;
        this.model = model;
        this.wheels = wheels;
        this.years = years;
    }

    public Auto() {
    }

    public Auto(String number, String manufacturer, String model, int wheels) {
        this.number = number;
        this.manufacturer = manufacturer;
        this.model = model;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", number='" + number + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", wheels=" + wheels +
                ", years=" + years +
                ", run=" + run +
                '}';
    }
}
