package Clase1_ClasesyObjetos.ClasesPC;

public class RAM {

  private String model;
  private String brand;
  private int freq;
  private boolean rgb;
  private int busSpeed;

  //Getters methods
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getFreq() {
    return freq;
  }

  public void setFreq(int freq) {
    this.freq = freq;
  }

  public boolean isRgb() {
    return rgb;
  }

  public void setRgb(boolean rgb) {
    this.rgb = rgb;
  }

  public int getBusSpeed() {
    return busSpeed;
  }

  public void setBusSpeed(int busSpeed) {
    this.busSpeed = busSpeed;
  }
}
