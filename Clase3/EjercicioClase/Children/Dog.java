package Clase3.EjercicioClase.Children;

import Clase3.EjercicioClase.Parents.Pet;

public class Dog extends Pet {

  private String typeAnimal = "Dog";
  private String typeDog;

  public String getTypeAnimal() {
    return typeAnimal;
  }

  public void setTypeAnimal(String typeAnimal) {
    this.typeAnimal = typeAnimal;
  }

  public String getTypeDog() {
    return typeDog;
  }

  public void setTypeDog(String typeDog) {
    this.typeDog = typeDog;
  }

  //Overriding methods from pet to these Dogs
  @Override
  public void Eat(String food) {
    System.out.println("This " + this.typeAnimal + " eats " + food);
  }

  @Override
  public void Drink(String drink) {
    System.out.println("This " + this.typeAnimal + " drinks " + drink);
  }

  @Override
  public void Move(String animal) {
    System.out.println("I am a " + animal + " and I can move");
  }
}
