package src.main.um.recetas;

import src.main.um.entidades.Ingrediente;
import src.main.um.entidades.RecetaBase;

import java.util.Arrays;
import java.util.List;

public class RodajasDeManzana extends RecetaBase {
  public RodajasDeManzana() {
    super(2, List.of(new Ingrediente("Manzana", 1)), "Corta la manzana en rodajas.");
  }
}
