package Clase3.AccesModifiers;

public class ClaseHija extends Clase1 {

  String name;

  public void Print() {
    Clase1 clase1 = new ClaseHija();
    System.out.println(name);
  }
}
