package clase; // Assuming this is the package name

import interfaces.IAlimento;
import interfaces.IDescuento;
import interfaces.ILiquido;

import java.util.Date;

public class Vino implements ILiquido, IAlimento, IDescuento {

    private String marca;
    private String tipoVino;
    private double gradosAlcohol;
    private float precio;
    private float descuento;
    private float volumen;
    private String tipoEnvase;

    public Vino(String marca, String tipoVino, double gradosAlcohol, float precio) {
        this.marca = marca;
        this.tipoVino = tipoVino;
        this.gradosAlcohol = gradosAlcohol;
        this.precio = precio;
        this.descuento = 0.0f;
        this.volumen = 0.0f;
        this.tipoEnvase = "";
    }

    public Vino(String marca, float precio, double gradosAlcohol) {
        this.precio = precio;
        this.marca = marca;
        this.gradosAlcohol = gradosAlcohol;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    @Override
    public float getVolumen() {
        return volumen;
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
        if (descuento >= 0 && descuento <= 1) {
            this.descuento = descuento;
            this.precio = precio * (1 - descuento);
        }
    }

    @Override
    public float getDescuento() {
        return descuento;
    }

    @Override
    public float getPrecioDescuento() {
        return precio;
    }

    @Override
    public void setCaducidad(Date caducidad) {

    }

    @Override
    public Date getCaducidad() {
        return null;
    }

    @Override
    public int getCalorias() {
        return (int) (gradosAlcohol * 10);
    }

    @Override
    public String toString() {
        return "Vino " +
                "marca= " + marca +
                "\n- gradosAlcohol= " + gradosAlcohol +
                "\n- precio= " + precio +
                "\n- descuento= " + descuento + " %" +
                (volumen > 0 ? "\n- volumen= " + volumen : "") +
                (tipoEnvase.length() > 0 ? "\n- tipoEnvase='" + tipoEnvase + "'" : "");
    }
}
