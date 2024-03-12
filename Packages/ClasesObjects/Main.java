package Packages.ClasesObjects;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    float number_1 = Integer.parseInt(JOptionPane.showInputDialog("First number: "));
    float number_2 = Integer.parseInt(JOptionPane.showInputDialog("Second number: "));

    OperationsReturn op = new OperationsReturn();

    float sumaResult = op.suma(number_1, number_2);
    float restaResult = op.resta(number_1, number_2);
    float multiResult = op.multiplication(number_1, number_2);
    float diviResult = op.divison(number_1, number_2);

    System.out.println(sumaResult);
    System.out.println(restaResult);
    System.out.println(multiResult);
    System.out.println(diviResult);
  }
}