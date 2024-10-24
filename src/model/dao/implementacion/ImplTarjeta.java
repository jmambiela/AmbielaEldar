package model.dao.implementacion;

import model.dao.interfaces.InTarjeta;
import model.negocio.entities.Tarjeta;

import java.time.LocalDate;

public class ImplTarjeta implements InTarjeta {

    @Override
    public String obtenerInfo(Tarjeta tarjeta) {
        return "Marca:"+ tarjeta.getMarca()+ "\n"+
                "Número de tarjeta :"+ tarjeta.getNumerotarjeta()+ "\n"+
                "Cardholder:"+ tarjeta.getCardholder().getApellido()+" "+ tarjeta.getCardholder().getNombre() + "\n"+
                "Fecha de vencimiento:"+ tarjeta.getFechaVencimiento()+ "\n";
    }


    @Override
    public boolean esValida(Tarjeta tarjeta) {
        if(tarjeta.getFechaVencimiento().isAfter(LocalDate.now())){
            return true;
        } else { return false;}
    }

    @Override
    public boolean esDistinta(Tarjeta tarjeta, Tarjeta tarjeta2) {
        if(!tarjeta.getNumerotarjeta().equals(tarjeta2.getNumerotarjeta())){
            return true;
        }else { return false;}
    }

    @Override
    public double calcularTasa(Tarjeta tarjeta) {
        switch (tarjeta.getMarca()) {
            case VISA:
                return ((LocalDate.now().getYear()/LocalDate.now().getMonthValue()))/100;
            case NARA:
                return (LocalDate.now().getDayOfMonth()*0.5);
            case AMEX:
                return (LocalDate.now().getMonthValue()*0.1);
            default:
                throw new IllegalArgumentException("Marca aún no vinculada");
        }

    }
}
