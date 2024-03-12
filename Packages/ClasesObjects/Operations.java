package Packages.ClasesObjects;

/* import javax.swing.JOptionPane; */

public class Operations {

  float suma;
  float resta;
  float multiplication;
  float division;

  // Métodos para pedir la digitación de dos numeros
  /*
   * public void leerNumeros() {
   * numero_1 =
   * Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer numero:"));
   * numero_2 =
   * Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo numero:"));
   * }
   */

  public void sumar(float numero_1, float numero_2) {
    suma = numero_1 + numero_2;
  }

  public void restar(float numero_1, float numero_2) {
    resta = numero_1 - numero_2;
  }

  public void multiplication(float numero_1, float numero_2) {
    multiplication = numero_1 * numero_2;
  }

  public void division(float numero_1, float numero_2) {
    if (numero_1 == 0) {
      System.out.println("Cannot divide by zero");
    } else {
      division = numero_1 / numero_2;
    }
  }

  public void showOperationsOutput() {
    System.out.println("La suma es: " + suma);
    System.out.println("La resta es: " + resta);
    System.out.println("La multiplicación es: " + multiplication);
    System.out.println("La división es: " + division);
  }

}
