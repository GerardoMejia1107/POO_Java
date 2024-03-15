package Clase1_ClasesyObjetos.ClasesPC;

public class RAM extends Components {

  private int freq;
  private boolean rgb;
  private int busSpeed;

  //Getters methods

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
