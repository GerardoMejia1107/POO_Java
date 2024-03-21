package Clase3.EjercicioClase.Children;

public class Main {

  public static void main(String[] args) {
    Dog pastorAleman = new Dog();
    Cat cat = new Cat();

    pastorAleman.setSize(12);
    pastorAleman.setColors(pastorAleman.AskColors("red", "green", "blue"));

    for (String color : pastorAleman.getColors()) {
      System.out.println("The color is: " + color);
    }
  }
}
