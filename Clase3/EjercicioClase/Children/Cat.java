package Clase3.EjercicioClase.Children;

import Clase3.EjercicioClase.Parents.Pet;

public class Cat extends Pet {

  private String typeAnimal;
  private String typeCat;

  public String getTypeAnimal() {
    return typeAnimal;
  }

  public void setTypeAnimal(String typeAnimal) {
    this.typeAnimal = typeAnimal;
  }

  public String getTypeCat() {
    return typeCat;
  }

  public void setTypeCat(String typeCat) {
    this.typeCat = typeCat;
  }

  public Cat() {
    this.typeAnimal = "Cat";
  }
}
