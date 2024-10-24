package model.negocio.entities;
import model.negocio.enumeradores.eMarca;
import java.time.LocalDate;

public class Tarjeta {
    private eMarca marca;
    private String numerotarjeta;
    private Cardholder cardholder;
    private LocalDate fechaVencimiento;

    public Tarjeta(eMarca marca, String numerotarjeta, Cardholder cardholder, LocalDate fechaVencimiento) {
        this.marca = marca;
        this.numerotarjeta = numerotarjeta;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;
    }

    public eMarca getMarca() {
        return marca;
    }

    public void setMarca(eMarca marca) {
        this.marca = marca;
    }

    public String getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjetamero(String numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public Cardholder getCardholder() {
        return cardholder;
    }

    public void setCardholder(Cardholder cardholder) {
        this.cardholder = cardholder;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
