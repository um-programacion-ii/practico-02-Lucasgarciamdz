package src.main.um.recetas;

import src.main.um.entidades.Ingrediente;
import src.main.um.entidades.RecetaBase;

import java.util.List;

public class HuevosRevueltos extends RecetaBase {
  public HuevosRevueltos() {
    super(
        5,
        List.of(
          new Ingrediente("Huevos", 2), new Ingrediente("Sal", 1), new Ingrediente("Mantequilla", 1)
        ),
        "Bate los huevos, derrite la mantequilla en una sartén, añade los huevos, revuelve hasta que estén cocidos, añade sal al gusto.");
  }
}