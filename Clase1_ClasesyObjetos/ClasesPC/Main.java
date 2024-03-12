package Clase1_ClasesyObjetos.ClasesPC;

public class Main {

  public static void main(String[] args) {
    RAM memoria = new RAM(); //Instancia, creación de un objeto
    CPU cpu = new CPU();

    //memoria sets
    memoria.setBrand("Kingston");
    memoria.setModel("Fury");
    memoria.setRgb(true);
    memoria.setFreq(4200);

    Motherboard myPc = new Motherboard();
    myPc.setRam(memoria);
  }
}
