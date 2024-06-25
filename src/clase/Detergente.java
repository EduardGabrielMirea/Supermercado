package clase;

import interfaces.IDescuento;
import interfaces.ILiquido;

public class Detergente implements ILiquido, IDescuento {

    public String marca;
    public float precio;
    public Supermercado supermercado;
    public  float volumen;
    public String tipoEnvase;
    public float descuento;


    public Detergente(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    @Override
    public void setVolumen(float volumen) {
        this.volumen = volumen;

    }

    @Override
    public float getVolumen() {
        return 0;
    }

    @Override
    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    @Override
    public String getTipoEnvase() {
     return tipoEnvase;
    }

    @Override
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public float getDescuento() {
        return 0;
    }

    @Override
    public float getPrecioDescuento() {
        return precio * (1 - descuento);
    }


    @Override
    public String toString() {
        return "Detergente: \n" +
                "- marca=" + marca +
                "\n- precio=" + precio  +
                "\n- volumen=" + volumen +
                "\n- tipoEnvase=" + tipoEnvase +
                "\n- descuento=" + descuento;
    }
}
