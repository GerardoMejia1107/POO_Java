//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;

public class Main {

  public void Menu(Calculadora calculadora) {
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicacion");
    System.out.println("4. Division");

    int option = Integer.parseInt(
      JOptionPane.showInputDialog("Escribe el numero de opcion a realizar: ")
    );

    switch (option) {
      case 1:
        double sumCalc = calculadora.Suma(
          calculadora.getFirstNumber(),
          calculadora.getSecondNumber()
        );
        System.out.println("La sumatoria es: " + sumCalc);
        break;
      case 2:
        double subsCalc = calculadora.Resta(
          calculadora.getFirstNumber(),
          calculadora.getSecondNumber()
        );
        System.out.println("La resta es: " + subsCalc);
        break;
      case 3:
        double multiCalc = calculadora.Multiplicacion(
          calculadora.getFirstNumber(),
          calculadora.getSecondNumber()
        );
        System.out.println("La multiplicacion es: " + multiCalc);
        break;
      case 4:
        double diviCalc = calculadora.Divison(
          calculadora.getFirstNumber(),
          calculadora.getSecondNumber()
        );
        System.out.println("La division es: " + diviCalc);
        break;
      default:
        break;
    }
  }

  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    Main main = new Main();
    double number1 = Integer.parseInt(
      JOptionPane.showInputDialog("Escribe el primer numero: ")
    );
    double number2 = Integer.parseInt(
      JOptionPane.showInputDialog("Escribe el segundo numero: ")
    );

    calculadora.setNumer1(number1);
    calculadora.setNumber2(number2);

    main.Menu(calculadora);
  }
}
