package Clase2.SuperKeyword;

//Making inheritance, the parent is Animal and the child is Aguila
public class Aguila extends Animal {

  //Overrading the makeNoise() method
  @Override
  public void makeNoise() {
    super.makeNoise(); // -> I am accessing the parent makeNoise() method
    System.out.println("I can fly!");
  }
}
