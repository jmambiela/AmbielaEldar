package model.dao.interfaces;

import model.negocio.entities.Tarjeta;

public interface InTarjeta {

    public String obtenerInfo(Tarjeta tarjeta);


    public boolean esValida(Tarjeta tarjeta);

    public boolean esDistinta(Tarjeta tarjeta, Tarjeta tarjeta2);

    public double calcularTasa(Tarjeta tarjeta);
}
