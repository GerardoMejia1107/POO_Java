package Clase5;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Child extends Parent {

  @Override
  public Vector<Integer> mi() {
    List<Integer> result = super.mi(); //Se va a mantener la ejecución original
    Vector<Integer> returnValue = new Vector<Integer>();
    return returnValue;
  }

  public Child() {
    super(); //esto manda a llamar al constructor del padre
  }
}
