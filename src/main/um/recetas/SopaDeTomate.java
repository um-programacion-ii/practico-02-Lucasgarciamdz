package src.main.um.recetas;

import java.util.Arrays;
import src.main.um.entidades.Ingrediente;
import src.main.um.entidades.RecetaBase;

public class SopaDeTomate extends RecetaBase {
  public SopaDeTomate() {
    super(
        30,
        Arrays.asList(
            new Ingrediente("Tomates", 4),
            new Ingrediente("Sal", 1),
            new Ingrediente("Pimienta", 1)),
        "Licúa los tomates, cocina la mezcla en una olla, añade sal y pimienta al gusto.");
  }
}
