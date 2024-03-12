package Packages.ClasesObjects;

public class Coche {

  String color;
  String modelo;
  String marca;
  int km;

  // Método
  public static void main(String[] args) {
    Coche coche_1 = new Coche(); // Una nueva instancia de mi clase Coche
    coche_1.color = "White";
    coche_1.modelo = "Corola";
    coche_1.marca = "Toyota";

    coche_1.km = 0;

    System.out.println("El color del coche es " + coche_1.color);
    System.out.println("El modelo del coche es " + coche_1.modelo);
    System.out.println("La marca del coche es " + coche_1.marca);
    System.out.println("El km inicial del coche es " + coche_1.km);
  }
}
