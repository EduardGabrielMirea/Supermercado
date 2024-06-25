package clase;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    public String nombre;
    public List<Cereal> cereales;
    public List<Detergente> detergentes;

    public Supermercado(String nombre) {
        this.nombre = nombre;
        this.cereales = new ArrayList<>();
        this.detergentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCereal(Cereal cereal) {
        this.cereales.add(cereal);
    }

    public void removeCereal(Cereal cereal) {
        this.cereales.remove(cereal);
    }

    public List<Cereal> getCereales() {
        return cereales;
    }

    public void addDetergente(Detergente detergente) {
        this.detergentes.add(detergente);
    }

    public void removeDetergente(Detergente detergente) {
        this.detergentes.remove(detergente);
    }

    public List<Detergente> getDetergentes() {
        return detergentes;
    }

    @Override
    public String toString() {
        return "Supermercado: " + nombre + "\nCereales: " + cereales + "\nDetergentes: " + detergentes;
    }
}
