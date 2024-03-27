package src.main.um.recetas;

import src.main.um.entidades.Ingrediente;
import src.main.um.entidades.RecetaBase;

import java.util.List;

public class Espaguetis extends RecetaBase {
  public Espaguetis() {
    super(
        20,
        List.of(
          new Ingrediente("Espaguetis", 100),
          new Ingrediente("Salsa de Tomate", 100),
          new Ingrediente("Sal", 1)
        ),
        "Cocina los espaguetis, calienta la salsa, mezcla todo, añade sal al gusto.");
  }
}
