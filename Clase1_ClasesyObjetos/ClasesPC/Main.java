package Clase1_ClasesyObjetos.ClasesPC;

public class Main {

  public static void main(String[] args) {
    RAM ram = new RAM(); //Instancia, creación de un objeto
    CPU cpu = new CPU();
    Storage almacenamiento = new Storage();
    OS os = new OS();
    Motherboard myPc = new Motherboard();

    //Declaring some values for ram object
    ram.setBrand("Corsair"); //this method is inherited from the parent class component
    ram.setModel("Rz-1"); //this method is inherited from the parent class component
    ram.setFreq(2400);

    //Declaring some values for cpu object
    cpu.setBrand("Dell");
    cpu.setModel("Dell-12");
    cpu.setCOPUName("Gerardo cpu");

    //Declaring some values for almacenamiento object
    almacenamiento.setBrand("Intel");
    almacenamiento.setCapacityInGB(5000);
    almacenamiento.setModel("i7");
    almacenamiento.setOperatingSystem(os);

    //Declaring some values for os object
    os.setBrand("Linux");
    os.setModel("Ubuntu");
    os.setVersion("18.04");

    //Declaring some values for myPc object
    myPc.setBrand("MacOS");
    myPc.setModel("MacOS");
    myPc.setRam(ram);
    myPc.setCpu(cpu);
    myPc.setStorage(almacenamiento);
    System.out.println(myPc.getRam().getBrand());
  }
}
