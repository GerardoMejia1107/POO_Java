//In this ex
package Clase2.SuperKeyword;

public class Animal {

  private String name;
  private String family;
  private int age;
  private boolean alive;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isAlive() {
    return alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }

  //new methods
  public void makeNoise() {
    System.out.println("---------");
  }
}
