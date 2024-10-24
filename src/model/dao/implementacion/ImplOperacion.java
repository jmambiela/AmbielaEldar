package model.dao.implementacion;
import model.dao.interfaces.InOperacion;
import model.dao.interfaces.InTarjeta;
import model.negocio.entities.Operacion;
import model.negocio.entities.Tarjeta;

public class ImplOperacion implements InOperacion {

    private InTarjeta it = new ImplTarjeta();

    @Override
    public boolean esValida(Operacion operacion) {
        if(operacion.getMonto() < 1000 && it.esValida(operacion.getTarjeta())){
            return true;
        } else { return false;}

    }
}
