package Clase1_ClasesyObjetos.ClasesPC;

public class CPU extends Components {

  private String cpuName;
  private int threads;
  private int cores;
  private int busSpeed;

  //Getters methods

  public String getCPUName() {
    return cpuName;
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
}
