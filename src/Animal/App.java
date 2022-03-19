package Animal;

public class App {
    public static void main(String[] args) {
       Animal dog = new Animal();
       dog.color ="Grey";
       dog.height=120;
       dog.weight=35;
       dog.speed=60;

      Animal dog2 = new Animal(45,"White",134,56);
        System.out.println(dog2);
        Animal dog3= new Animal("Black",143);
        System.out.println(dog3);
    }
}
