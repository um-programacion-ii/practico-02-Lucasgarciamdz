package src.main.um.entidades;

import src.main.um.interfaces.Despensable;

public class Despensa {

  Ingrediente[] ingredientes;
  Despensable[] despensables;

  public Despensa() {
    ingredientes = new Ingrediente[10];
  }

  public Despensa(int cantidad) {
    ingredientes = new Ingrediente[cantidad];
  }

  public void addIngrediente(Ingrediente ingrediente) {
    for (int i = 0; i < ingredientes.length; i++) {
      if (ingredientes[i] == null) {
        ingredientes[i] = ingrediente;
        break;
      }
    }
  }

  public String getIngrediente(String nombre, int cantidad) {
    for (Ingrediente ingrediente : ingredientes) {
      if (ingrediente != null && ingrediente.getNombre().equals(nombre)) {
        return ingrediente.sacar(cantidad);
      }
    }
    return "No se encontro el ingrediente";
  }

  public Ingrediente[] getIngredientes() {
    return ingredientes;
  }

  @Override
  public String toString() {
    String despensaStr = "Despensa:\n";
    for (Ingrediente ingrediente : ingredientes) {
      if (ingrediente != null) {
        despensaStr += ingrediente + "\n";
      }
    }
    return despensaStr;
  }
}
