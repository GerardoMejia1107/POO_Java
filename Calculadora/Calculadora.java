public class Calculadora {

  private double firstNumber;
  private double secondNumber;

  //Setters and getters
  public void setNumer1(double number) {
    this.firstNumber = number;
  }

  public void setNumber2(double number) {
    this.secondNumber = number;
  }

  public double getFirstNumber() {
    return this.firstNumber;
  }

  public double getSecondNumber() {
    return this.secondNumber;
  }

  //------------------------------------------------------------------------------------------------------
  //Here starts the methods(operations) of my calculator
  public double Suma(double firstNumber, double secondNumber) {
    double result = this.firstNumber + this.secondNumber;
    return result;
  }

  public double Resta(double firstNumber, double secondNumber) {
    double result = this.firstNumber - this.secondNumber;
    return result;
  }

  public double Multiplicacion(double firstNumber, double secondNumber) {
    double result = this.firstNumber * this.secondNumber;
    return result;
  }

  public double Divison(double firstNumber, double secondNumber) {
    if (secondNumber == 0) {
      this.MessageError();
      return 0;
    } else {
      double result = this.firstNumber / this.secondNumber;
      return result;
    }
  }

  public String MessageError() {
    String error = "Operation error";
    return error;
  }
}
