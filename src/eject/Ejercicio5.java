package eject;

import java.util.Locale;
public class Ejercicio5 {

    public static void main(String[] args) {



        String[] arrayString = {"TesTING","THIS","for","EldaR"};

        if(arrayString.length<=10){
            unirYConvertir(arrayString);

        }else{
            System.out.println("La matriz es demasiado grande");
        }

    }

    public static void unirYConvertir(String[] array) {

        StringBuilder resultado = new StringBuilder();

        for (String s : array) {
            if(s.matches("[a-zA-Z]*")){
                resultado.append(s.toLowerCase()).append(" ");
            }else {
                System.out.println( "Hay caracteres inválidos");
                return;
            }
        }
        System.out.println("        Ejercicio Cinco"+"\n"+ "Resultado: "+resultado);
    }

}




