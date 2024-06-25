package clase;

import java.util.HashSet;
import java.util.Set;

public class Supermercado {
    public String nombre;
    public Set<Cereal> cereals;
    public Set<Detergente> detergentes;

    public Supermercado(String nombre, Set<Cereal> cereals, Set<Detergente> detergentes) {
        this.nombre = nombre;
        this.cereals = new HashSet<>();
        this.detergentes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Cereal> getCereales() {
        return cereals;
    }

    public void setCereales(Set<Cereal> cereals) {
        this.cereals = cereals;
    }

    public Set<Detergente> getDetergentes() {
        return detergentes;
    }

    public void setDetergentes(Set<Detergente> detergentes) {
        this.detergentes = detergentes;
    }

    public void addCereal(Set<Cereal> cereal){
        this.cereals.addAll(cereal);
    }

    public void addDetergente(Set<Detergente> detergente){
        this.detergentes.addAll(detergente);
    }


    @Override
    public String toString(){
        return "El supermercado: "+this.nombre;
    }

}
