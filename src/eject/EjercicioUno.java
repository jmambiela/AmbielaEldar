package eject;

import model.dao.implementacion.ImplOperacion;
import model.dao.implementacion.ImplTarjeta;
import model.dao.interfaces.InOperacion;
import model.dao.interfaces.InTarjeta;
import model.negocio.entities.Cardholder;
import model.negocio.entities.Operacion;
import model.negocio.entities.Tarjeta;
import model.negocio.enumeradores.eMarca;
import java.time.LocalDate;

public class EjercicioUno {

    public static void main(String[]args){

        InTarjeta it = new ImplTarjeta();
        InOperacion io = new ImplOperacion();
        try{

            Cardholder cardholder1 = new Cardholder("ESTABAN GREGORIO", "LAMONTHE");
            Cardholder cardholder2 = new Cardholder("MARGARITA", "DEFAINES");

            Tarjeta arrayTarjeta[]=new Tarjeta[3];

            arrayTarjeta[0] = new Tarjeta(eMarca.NARA,"454578910", cardholder1, LocalDate.of(2025,12,31));
            arrayTarjeta[1] = new Tarjeta(eMarca.VISA,"422225977", cardholder2, LocalDate.of(2025,02,12));
            arrayTarjeta[2] = new Tarjeta(eMarca.AMEX,"489023412", cardholder1, LocalDate.of(2024,05,24));

            Operacion arrayOperacion[] = new Operacion[3];

            arrayOperacion[0] = new Operacion(1,1200, arrayTarjeta[0]);
            arrayOperacion[1] = new Operacion(2,650, arrayTarjeta[1]);
            arrayOperacion[2] = new Operacion(3,800, arrayTarjeta[2]);



            for (int i=0;i<arrayTarjeta.length;i++){
                System.out.println("# Información de la tarjeta");
                System.out.println(it.obtenerInfo(arrayTarjeta[i]));
                System.out.println("# La tasa de la tarjeta es de "+it.calcularTasa(arrayTarjeta[i])+"%"+"\n");
                if(it.esValida(arrayTarjeta[i])){
                    System.out.println("# La tarjeta es válida para operar"+ "\n");
                }else {
                    System.out.println("# La tarjeta no es válida para operar"+ "\n");
                }
                for (int e=0;e<arrayTarjeta.length;e++){
                if(it.esDistinta(arrayTarjeta[i],arrayTarjeta[e])){
                    System.out.println("# La tarjeta "+arrayTarjeta[i].getNumerotarjeta()+ " es distinta a la tarjeta "+ arrayTarjeta[e].getNumerotarjeta()+"\n");
                }
            }}

            System.out.println("OPERACIONES"+"\n");
            for(int i=0;i<arrayOperacion.length;i++){
                if(io.esValida(arrayOperacion[i])){
                    double importe = it.calcularTasa(arrayOperacion[i].getTarjeta())*arrayOperacion[i].getMonto();
                    System.out.println("# La operación "+ arrayOperacion[i].getId()+ " es válida, el importe sería de "+ importe+ "$"+"\n");
                }else{
                    System.out.println("# La operación "+ arrayOperacion[i].getId()+ " es no válida"+"\n");
                }
            }




             }catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se produjo un error inesperado: " + e.getMessage());
        }
    }
}
