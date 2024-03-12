package Packages.ClasesObjects;

public class OperationsReturn {

  // Métodos
  public float suma(float number_1, float number_2) {
    float outCome = number_1 + number_2;
    return outCome;
  }

  public float resta(float number_1, float number_2) {
    float outCome = number_1 - number_2;
    return outCome;
  }

  public float multiplication(float number_1, float number_2) {
    float outCome = number_1 * number_2;
    return outCome;
  }

  public float divison(float number_1, float number_2) {
    if (number_2 != 0) {
      float outCome = number_1 / number_2;
      return outCome;
    } else {
      System.out.println("Cannot  divide ");
      return 0;
    }
  }
}
