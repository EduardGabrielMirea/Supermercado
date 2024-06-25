package clase;

import interfaces.IAlimento;
import interfaces.IDescuento;
import interfaces.ILiquido;

public class Cereal implements IAlimento {
    public String marca;
    public String nombre;
    public float precio;
    public String tipoCereal;
    public Supermercado supermercado;

    public Cereal(String marca, String nombre, float precio, String tipoCereal, Supermercado supermercado) {
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
        this.supermercado = supermercado;
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

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }



    @Override
    public String toString(){
        return "La marca del cereal es: "+this.marca+", el tipo de cereal es: "+this.tipoCereal+", el precio del ceral es: "+this.precio;
    }
}
