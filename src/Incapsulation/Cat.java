package Incapsulation;

public class Cat {
  private   String name;
    private int age;

    public Cat(String name) {
        this.name = name;
        this.age= 1;

    }
  public   void newYear(){
        age++;
    }
   private String getMur(){
        return " mur mur";



    }
    public void pusico(){
        System.out.println(getMur());
    }
    String seePassport(){
        return "Cat{"+name+", "+age+"}";
    }
}
