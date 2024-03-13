package Clase1_ClasesyObjetos.ClasesPC;

public class Main {

  public static void main(String[] args) {
    RAM memoria = new RAM(); //Instancia, creación de un objeto
    CPU cpu = new CPU();
    Storage almacenamiento = new Storage(); 
    OS os = new OS();
    Motherboard myPc = new Motherboard();

    //memoria sets
    memoria.setBrand("Kingston");
    memoria.setModel("Fury");
    memoria.setRgb(true);
    memoria.setFreq(4200);

    //cpu sets
    cpu.setBrand("Intel");
    cpu.setCOPUName("gerardo");

    //os sets
    os.setBrand("Linux");
    os.setName("gerardo");
    os.setVersion("v -1.0");
    
    //almacenamiento sets
    almacenamiento.setBrand("Kingston");
    almacenamiento.setCapacityInGB(10000);
    almacenamiento.setOperatingSystem(os);
    almacenamiento.setType("SSD");
    almacenamiento.setReadSpd(200);
    almacenamiento.setWriteSpd(400);
    

    //motherboard sets
    myPc.setRam(memoria);
    myPc.setBrand("Asus");
    myPc.setModel("VivoBook");
    myPc.setStorage(almacenamiento);
    myPc.setCpu(cpu);

  }
}
