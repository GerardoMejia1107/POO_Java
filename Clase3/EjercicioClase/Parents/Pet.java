package Clase3.EjercicioClase.Parents;

import java.util.ArrayList;

public class Pet {

  private int size;
  private ArrayList<String> colors;
  private int lifeExpentancy;

  //Getters and setters methods
  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public ArrayList<String> getColors() {
    return colors;
  }

  public void setColors(ArrayList<String> colors) {
    this.colors = colors;
  }

  public int getLifeExpentancy() {
    return lifeExpentancy;
  }

  public void setLifeExpentancy(int lifeExpentancy) {
    this.lifeExpentancy = lifeExpentancy;
  }

  //Other useful methods
  public void Eat(String food) {
    System.out.println("This animal eats " + food);
  }

  public void Drink(String drink) {
    System.out.println("This animal eats " + drink);
  }

  public void Move(String animal) {
    System.out.println("I am a " + animal + " and I can move");
  }

  public ArrayList<String> AskColors(String... colors) {
    ArrayList<String> petColors = new ArrayList<String>();
    for (String color : colors) {
      petColors.add(color);
    }
    return petColors;
  }
}
