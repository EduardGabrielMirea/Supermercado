package entity;

import repository.IAlimento;

import java.util.Date;

public class Cereal implements IAlimento {
    public String marca;
    public float precio;
    public String tipoCereal;
    public Date fechaCaducidad;


    public Cereal(String marca, float precio) {
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

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }


    @Override
    public void setCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public Date getCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public int getCalorias() {
        switch (tipoCereal) {
            case "espelta":
                return 5;
            case "maíz":
                return 8;
            case "trigo":
                return 12;
            default:
                return 15;
        }
    }

    @Override
    public String toString() {
        return "Cereales: " +
                "marca= " + marca +
                "\n- precio= " + precio +" $"+
                "\n- tipoCereal= " + tipoCereal+
                "\n- fechaCaducidad= " + fechaCaducidad +
                "\n -calorias= " + getCalorias();
    }

}
