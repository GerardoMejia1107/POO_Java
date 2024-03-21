package Clase3.AccesModifiers.DifferentPackage;

//Here I am in a different package that is not a subclass of Class1
import Clase3.AccesModifiers.Clase1;

public class Clase2 {

  void Print() {
    Clase1 clase1 = new Clase1();
    System.out.println(clase1.apellido2);
  }
}
