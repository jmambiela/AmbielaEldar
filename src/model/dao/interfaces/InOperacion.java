package model.dao.interfaces;

import model.negocio.entities.Operacion;
import model.negocio.entities.Tarjeta;

public interface InOperacion {

    public boolean esValida(Operacion operacion);
}
