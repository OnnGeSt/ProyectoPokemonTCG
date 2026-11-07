package modeloCartas;

import java.util.List;

public class Ataque {
    private String nombre;
    private List<TipoEnergia> costo;
    private int danioBase;

    public Ataque(String nombre, List<TipoEnergia> costo, int danioBase){
        this.nombre = nombre;
        this.costo = costo;
        this.danioBase = danioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<TipoEnergia> getCosto() {
        return costo;
    }

    public void setCosto(List<TipoEnergia> costo) {
        this.costo = costo;
    }

    public int getdanioBase() {
        return danioBase;
    }

    public void setdanioBase(int danioBase) {
        this.danioBase = danioBase;
    }

    
}
