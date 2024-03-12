package Clase1_ClasesyObjetos.ClasesPC;

public class CPU {

  private String cpuName;
  private String brand;
  private int threads;
  private int cores;
  private int busSpeed;

  //Getters methods

  public String getCPUName() {
    return cpuName;
  }

  public String getBrand() {
    return brand;
  }

  public int getThreads() {
    return threads;
  }

  public int getCores() {
    return cores;
  }

  public int getBusSpeed() {
    return busSpeed;
  }

  //Setters methods
  public void setCOPUName(String cpuName) {
    this.cpuName = cpuName;
  }

  public void setBrand(String brand) {
    this.brand = brand;
    System.out.println(this);
  }
}
