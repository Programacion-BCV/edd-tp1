package com.programacion_bcd.ejercicio4;

import java.math.BigDecimal;
import java.util.Arrays;

public class ClientesAutomoviles {
    public static void main(String[] args) {
        Automovil[] param = new Automovil[4];

        param[0] = new Automovil("abc 478", new Tipo(("Sedan")), new Marca(("Fiat")), 2010,new BigDecimal("300000"));

        param[1] = new Automovil("abc 693", new Tipo(("Berlina")), new Marca(("Peugeot")),2019,new BigDecimal("2000000"));

        param[2] = new Automovil("abcd 1248", new Tipo(("Camioneta")), new Marca(("Toyota")), 2019,new BigDecimal("5000000"));

        param[3] = new Automovil("abc 123", new Tipo(("Sedan")), new Marca(("Volkswagen")),2010,new BigDecimal("500000"));

        System.out.println("Datos de Automoviles");
        imprimir(param);
        
        System.out.println("");

        System.out.println("Cantidad de vehiculos de igual modelo:");
        imprimir(filtrarPorAnio(param, 2019));
        
        System.out.println("");

        System.out.println("Automoviles de igual tipo:");
        
        imprimir(filtrarPorTipo(param, new Tipo("Sedan")));
        
        System.out.println("");
        
        System.out.println("Cantidad de vehiculos por modelos:");
        
        AnioCantidad[] retorno = cantidadPorAnio(param);
        for (int i = 0; i < retorno.length; i++) {
            if (retorno[i] != null) {
                System.out.println(retorno[i].toString());

            } else {
                break;
            }
        }
        System.out.println("");
        
        System.out.println("Sumatoria de valuaciones clasificadas por tipo de vehiculo");
        
        TipoValuacion[] retorno1 = valuacionesPorTipo(param);
        
        for (int i = 0; i < retorno1.length; i++) {
            if (retorno1[i] != null) {
                System.out.println(retorno1[i].toString());

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

private static TipoValuacion[] valuacionesPorTipo(Automovil[] param) {
        int j;
        boolean pusheado;
        TipoValuacion[] retorno1 = new TipoValuacion[param.length];

        for (int i = 0; i < param.length; i++) {
            pusheado = false;
            if (i == 0) {
                retorno1[i] = new TipoValuacion(param[i].getTipo().getDescripcion(),param[i].getValuacion());
            } else {
                j = 0;

                do {
                    if (retorno1[j].getTipo() == param[i].getTipo().getDescripcion()) {
                        retorno1[j].setSumaValuacion(retorno1[j].getSumaValuacion().add(param[i].getValuacion()));
                        pusheado = true;
                    }

                    j++;

                } while (retorno1[j] != null && !pusheado);
                if (retorno1[j] == null && !pusheado) {
                    retorno1[j] = new TipoValuacion(param[i].getTipo().getDescripcion(), param[i].getValuacion());
                }
            }

        }
        return retorno1;
    }
} 