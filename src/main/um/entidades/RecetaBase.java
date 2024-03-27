package src.main.um.entidades;

import src.main.um.entidades.Despensa;
import src.main.um.entidades.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class RecetaBase {

  int tiempoCoccion;
  List<Ingrediente> ingredientes;

  String preparacion;

  public RecetaBase() {
    ingredientes = new ArrayList<>();
  }

  public RecetaBase(int tiempoCoccion, List<Ingrediente> ingredientes, String preparacion) {
    this.tiempoCoccion = tiempoCoccion;
    this.ingredientes = ingredientes;
    this.preparacion = preparacion;
  }

  public int getTiempoCoccion() {
    return tiempoCoccion;
  }

  public void setTiempoCoccion(int tiempoCoccion) {
    this.tiempoCoccion = tiempoCoccion;
  }

  public List<Ingrediente> getIngredientes() {
    return ingredientes;
  }

  public void setIngredientes(List<Ingrediente> ingredientes) {
    this.ingredientes = ingredientes;
  }

  public String getPreparacion() {
    return preparacion;
  }

  public void setPreparacion(String preparacion) {
    this.preparacion = preparacion;
  }

  public Boolean sePuedeCocinar(Despensa despensa) {
    for (Ingrediente ingrediente : this.getIngredientes()) {
      if (ingrediente != null) {
        String hayIngredientes =
            despensa.getDespensable(ingrediente.getNombre(), ingrediente.getCantidad());
        if (hayIngredientes.equals("No se encontro el ingrediente")
            || hayIngredientes.startsWith("No hay suficiente")) {
          return false;
        }
      }
    }
    return true;
  }

  public String queFalta(Despensa despensa) {
    String faltan = "Faltan los siguientes ingredientes:\n";
    for (Ingrediente ingrediente : this.getIngredientes()) {
      if (ingrediente != null) {
        String hayIngredientes =
            despensa.getDespensable(ingrediente.getNombre(), ingrediente.getCantidad());
        if (hayIngredientes.equals("No se encontro el ingrediente")
            || hayIngredientes.startsWith("No hay suficiente")) {
          faltan += hayIngredientes + "\n";
        }
      }
    }
    return faltan;
  }

  @Override
  public String toString() {
    String recetaStr = "Receta:\n";
    recetaStr += "Tiempo de coccion: " + tiempoCoccion + "\n";
    recetaStr += "Ingredientes:\n";
    for (Ingrediente ingrediente : ingredientes) {
      if (ingrediente != null) {
        recetaStr += ingrediente + "\n";
      }
    }
    recetaStr += "Preparacion: " + preparacion + "\n";
    return recetaStr;
  }
}
