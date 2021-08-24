package com.programacion_bcd.ejercicio_4;

import java.math.BigDecimal;

public class ClientesAutomoviles {

    public static void main(String[] args) {
        Automovil[] param = new Automovil[4];

        param[0] = new Automovil("abc 478", new Tipo(("Sedan")), new Marca(("Fiat")), 2010, new BigDecimal("300000"));

        param[1] = new Automovil("abc 693", new Tipo(("Berlina")), new Marca(("Peugeot")), 2019,
                new BigDecimal("2000000"));

        param[2] = new Automovil("abcd 1248", new Tipo(("Camioneta")), new Marca(("Toyota")), 2019,
                new BigDecimal("5000000"));

        param[3] = new Automovil("abc 123", new Tipo(("Sedan")), new Marca(("Volkswagen")), 2012,
                new BigDecimal("500000"));

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
            System.out.println(retorno1[i].toString());
        }

    }

    private static void imprimir(Automovil[] param) {
        for (int i = 0; i < param.length; i++) {
            System.out.println(param[i].toString());
        }
    }

    private static Automovil[] filtrarPorAnio(Automovil[] param, int anio) {
        Automovil[] retorno = new Automovil[0];

        for (int i = 0; i < param.length; i++) {
            if (param[i].getAnio() == anio) {

                Automovil[] auxAutomovil = new Automovil[retorno.length + 1];

                for (int j = 0; j < retorno.length; j++) {
                    auxAutomovil[j] = retorno[j];
                }

                retorno = auxAutomovil;
                retorno[retorno.length - 1] = param[i];

            }
        }
        return retorno;
    }

    private static Automovil[] filtrarPorTipo(Automovil[] param, Tipo tipo) {
        Automovil[] retorno = new Automovil[0];

        for (int i = 0; i < param.length; i++) {
            if (param[i].getTipo().equals(tipo)) {
                Automovil[] auxAutomovil = new Automovil[retorno.length + 1];

                for (int j = 0; j < retorno.length; j++) {
                    auxAutomovil[j] = retorno[j];
                }

                retorno = auxAutomovil;
                retorno[retorno.length - 1] = param[i];
            }
        }
        return retorno;
    }

    private static AnioCantidad[] cantidadPorAnio(Automovil[] param) {
        int j;
        boolean pusheado;
        AnioCantidad[] retorno = new AnioCantidad[0];

        for (int i = 0; i < param.length; i++) {
            pusheado = false;
            if (i == 0) {

                AnioCantidad[] auxACantidad = new AnioCantidad[retorno.length + 1];

                for (int x = 0; x < retorno.length; x++) {
                    auxACantidad[x] = retorno[x];
                }

                retorno = auxACantidad;
                retorno[retorno.length - 1] = new AnioCantidad(param[i].getAnio(), 1);
            } else {
                j = 0;

                do {
                    if (retorno[j].getModelo() == param[i].getAnio()) {
                        retorno[j].setCantidad(retorno[j].getCantidad() + 1);
                        pusheado = true;
                    }

                    j++;

                } while (j < retorno.length && !pusheado);
                if (j == retorno.length && !pusheado) {
                    AnioCantidad[] auxACantidad = new AnioCantidad[retorno.length + 1];

                    for (int x = 0; x < retorno.length; x++) {
                        auxACantidad[x] = retorno[x];
                    }

                    retorno = auxACantidad;
                    retorno[retorno.length - 1] = new AnioCantidad(param[i].getAnio(), 1);
                }
            }
        }
        return retorno;
    }

    private static TipoValuacion[] valuacionesPorTipo(Automovil[] param) {
        int j;
        boolean pusheado;
        TipoValuacion[] retorno = new TipoValuacion[0];

        for (int i = 0; i < param.length; i++) {
            pusheado = false;
            if (i == 0) {

                TipoValuacion[] auxTipoValuacion = new TipoValuacion[retorno.length + 1];

                for (int x = 0; x < retorno.length; x++) {
                    auxTipoValuacion[x] = retorno[x];
                }
                retorno = auxTipoValuacion;
                retorno[retorno.length - 1] = new TipoValuacion(param[i].getTipo().getDescripcion(),
                        param[i].getValuacion());
            } else {
                j = 0;

                do {
                    if (retorno[j].getTipo() == param[i].getTipo().getDescripcion()) {
                        retorno[j].setSumaValuacion(retorno[j].getSumaValuacion().add(param[i].getValuacion()));
                        pusheado = true;
                    }

                    j++;

                } while (j < retorno.length && !pusheado);
                if (j == retorno.length && !pusheado) {

                    TipoValuacion[] auxTipoValuacion = new TipoValuacion[retorno.length + 1];

                    for (int x = 0; x < retorno.length; x++) {
                        auxTipoValuacion[x] = retorno[x];
                    }

                    retorno = auxTipoValuacion;
                    retorno[retorno.length - 1] = new TipoValuacion(param[i].getTipo().getDescripcion(),
                            param[i].getValuacion());

                }
            }
        }
        return retorno;
    }
}