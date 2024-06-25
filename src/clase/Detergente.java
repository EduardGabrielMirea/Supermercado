package clase;

import interfaces.IDescuento;
import interfaces.ILiquido;

public class Detergente implements ILiquido, IDescuento {

    public String marca;
    public float precio;
    public Supermercado supermercado;

    public Detergente(String marca, float precio,Supermercado supermercado) {
        this.marca = marca;
        this.precio = precio;
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

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    @Override
    public String toString(){
        return  "La marca del producto: "+this.marca+", el precio del producto: " +this.precio;
    }
}
