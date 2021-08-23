package com.programacion_bcd.ejercicio4;

import java.math.BigDecimal;
import java.util.Arrays;

public class ClientesAutomoviles {
    public static void main(String[] args) {
        Automovil[] param = new Automovil[4];

        param[0] = new Automovil("abc 478", new Tipo(("Sedan")), new Marca(("Fiat")), 2010);

        param[1] = new Automovil("abc 693", new Tipo(("Berlina")), new Marca(("Peugeot")), 2019);

        param[2] = new Automovil("abcd 1248", new Tipo(("Camioneta")), new Marca(("Toyota")), 2019);

        param[3] = new Automovil("abc 123", new Tipo(("Sedan")), new Marca(("Fiat")), 2010);

        // System.out.println("Datos de Automoviles");
        // imprimir(param);

        // System.out.println("Cantidad de vehiculos de igual modelo:");
        // imprimir(filtrarPorAnio(param, 2019));

        // System.out.println("Automoviles de igual tipo:");
        // imprimir(filtrarPorTipo(param, new Tipo("Sedan")));
        AnioCantidad[] retorno = cantidadPorAnio(param);
        for (int i = 0; i < retorno.length; i++) {
            if (retorno[i] != null) {
                System.out.println(retorno[i].toString());

            } else {
                break;
            }
        }
    }

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
            if (param[i].getAnio() == anio) {
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

    private static AnioCantidad[] cantidadPorAnio(Automovil[] param) {
        int j;
        boolean pusheado;
        AnioCantidad[] retorno = new AnioCantidad[param.length];

        for (int i = 0; i < param.length; i++) {
            pusheado = false;
            if (i == 0) {
                retorno[i] = new AnioCantidad(param[i].getAnio(), 1);
            } else {
                j = 0;

                do {
                    if (retorno[j].getModelo() == param[i].getAnio()) {
                        retorno[j].setCantidad(retorno[j].getCantidad() + 1);
                        pusheado = true;
                    }

                    j++;

                } while (retorno[j] != null && !pusheado);
                if (retorno[j] == null && !pusheado) {
                    retorno[j] = new AnioCantidad(param[i].getAnio(), 1);
                }
            }

        }
        return retorno;
    }

}
