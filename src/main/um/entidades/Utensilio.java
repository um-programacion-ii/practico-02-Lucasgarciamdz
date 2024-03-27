package src.main.um.entidades;

import src.main.um.interfaces.Despensable;
import src.main.um.interfaces.Reutilizable;

public class Utensilio implements Despensable, Reutilizable {

  private int vidaUtil;
  private String nombre;

  public Utensilio() {}

  public Utensilio(String nombre, int vidaUtil) {
    this.nombre = nombre;
    this.vidaUtil = vidaUtil;
  }

  @Override
  public String sacar(int cantidad) {
    if (vidaUtil >= cantidad) {
      vidaUtil -= cantidad;
      return "Se han sacado " + cantidad + " usos";
    } else {
      return "No hay suficientes usos, faltan " + (cantidad - vidaUtil);
    }
  }

  @Override
  public int getVidaUtil() {
    return vidaUtil;
  }

  @Override
  public void setVidaUtil(int vidaUtil) {
    this.vidaUtil = vidaUtil;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + ", Vida util: " + vidaUtil;
  }

  public String getNombre() {
    return nombre;
  }
}
