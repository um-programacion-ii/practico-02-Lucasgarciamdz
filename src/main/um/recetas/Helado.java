package src.main.um.recetas;

import src.main.um.entidades.Ingrediente;
import src.main.um.entidades.RecetaBase;

import java.util.List;

public class Helado extends RecetaBase {
  public Helado() {
    super(0, List.of(new Ingrediente("Helado", 1)), "Sirve el helado.");
  }
}
