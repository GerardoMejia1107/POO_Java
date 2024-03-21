package Clase3.Override;

public class Chihuahua extends Dog {

  //Here I am overriding the method made in the parent class Dog
  @Override
  public void Bark() {
    super.Bark(); //I am just accesing the original method made in the parent class by using super keyword
    System.out.println("I bark like yep yep! ");
  }
}
