package Clase1_ClasesyObjetos.ClasesPC;

import java.util.ArrayList;

public class Motherboard extends Components {

  private CPU cpu;
  private RAM ram;
  private Storage storage;

  public CPU getCpu() {
    return cpu;
  }

  public void setCpu(CPU cpu) {
    this.cpu = cpu;
  }

  public RAM getRam() {
    return ram;
  }

  public void setRam(RAM ram) {
    this.ram = ram;
  }

  public Storage getStorage() {
    return storage;
  }

  public void setStorage(Storage storage) {
    this.storage = storage;
  }
}
