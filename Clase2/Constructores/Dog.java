package Clase2.Constructores;

public class Dog {

  private String name;
  private String hasOwner;
  private int age;
  private boolean alive;
  private String family;
  private String color;
  private String gender;

  public Dog(String name, String family) {
    this.name = name;
    this.family = family;
  }

  public void mostrarDatos() {
    System.out.println("El nombre es:" + this.name);
    System.out.println("La familia es:" + this.family);
  }
}
