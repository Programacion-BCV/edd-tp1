package ControlAutomotris;

import java.math.BigDecimal;
import java.util.Arrays;

public class ClientesAutomoviles {

    private static void imprimir(Automovil[] param) {
        for (int i = 0; i < param.length; i++) {
            if (param[i] != null) {
                System.out.println(param[i].toString());
            }
        }
    }

    private static Automovil[] filtrarPorAnio(Automovil[] param, int anio) {
        Automovil[] retorno = new Automovil[param.length];

        for (int i = 0; i < param.length; i++) {
            if (param[i].getAnio()== anio) {
                retorno[i] = param[i];
            }
        }
        return retorno;
    }

    private static Automovil[] filtrarPorTipo(Automovil[] param, Tipo tipo) {
        Automovil[] retorno = new Automovil[param.length];

        for (int i = 0; i < param.length; i++) {
            if (param[i].getTipo().equals(tipo)) {
                retorno[i] = param[i];
            }
        }
        return retorno;
    }
    
    private static AnioCantidad[] cantidadPorAnio(Automovil[] param){
        AnioCantidad[] retorno= new AnioCantidad[param.length];
        for (int i = 0; i < param.length-1; i++) {  
           if (i==0){
             retorno[i].setModelo(param[i].getAnio());
}
           int cont = 0;
            for (int j = i ; j==0 ; --j) {
                if (param[i].getAnio()==param[j].getAnio()){
                cont+=1;
                }
                if (cont==0){
                    retorno[i].setModelo(param[i].getAnio());
                }
}
        }
            for (int i = 0; i < retorno.length-1; i++) {
                int cont2=0;
                for (int j = 0; j < param.length-1; i++) {  
                    if (j>i){
                        if (retorno[i].getModelo()== param[j].getAnio()){
                            cont2+=1;
                            retorno[i].setModelo(cont2);
                        }
                    }
                }
            }
        return retorno;
    }

    public static void main(String[] args) {
        Automovil[] param = new Automovil[4];

        param[0] = new Automovil("abc 478", new Tipo(("Sedan")), new Marca(("Fiat")), 2010);

        param[1] = new Automovil("abc 693", new Tipo(("Berlina")), new Marca(("Peugeot")), 2019);

        param[2] = new Automovil("abcd 1248", new Tipo(("Camioneta")), new Marca(("Toyota")), 2019);

        param[3] = new Automovil("abc 123", new Tipo(("Sedan")), new Marca(("Fiat")), 2010);

        System.out.println("Datos de Automoviles");
        imprimir(param);
        
        System.out.println("Cantidad de vehiculos de igual modelo:");
        imprimir(filtrarPorAnio(param,2019));
     
        
        System.out.println("Automoviles de igual tipo:");
        imprimir(filtrarPorTipo(param, new Tipo("Sedan")));
        
        cantidadPorAnio(param);

    }}

