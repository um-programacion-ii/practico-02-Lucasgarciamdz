package src.main.um.entidades;

import src.main.um.interfaces.Despensable;
import src.main.um.interfaces.Reutilizable;

public class Utensilio implements Despensable, Reutilizable {

    private int vidaUtil;

    @Override
    public String sacar(int cantidad) {
        return null;
    }

    @Override
    public int getVidaUtil() {
        return vidaUtil;
    }

    @Override
    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public Utensilio() {
    }

    public Utensilio(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }
}
