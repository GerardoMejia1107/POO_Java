package Clase1_ClasesyObjetos.ClasesPC;

public class PSU extends Components {

  private double voltage;
  private double current;
  private String certification;

  public double getVoltage() {
    return voltage;
  }

  public void setVoltage(double voltage) {
    this.voltage = voltage;
  }

  public double getCurrent() {
    return current;
  }

  public void setCurrent(double current) {
    this.current = current;
  }

  public String getCertification() {
    return certification;
  }

  public void setCertification(String certification) {
    this.certification = certification;
  }
}
