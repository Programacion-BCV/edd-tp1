package com.programacion_bcd.ejercicio3;

public class ClienteBichitos {
    public static void main(String[] args) {
        Mascota[] param = new Mascota[7];
        param[0] = new Mascota(1000, "Michi", new Raza("Siamese", new Especie("Gato")), 2010,
                new Persona("Gonzalez", "Miguel", "35498031"));
        param[1] = new Mascota(1001, "Toby", new Raza("Caniche", new Especie("Perro")), 2015,
                new Persona("Confalonieri", "Juan", "40692538"));
        param[2] = new Mascota(1002, "Pelusa", new Raza("Ragdoll", new Especie("Gato")), 2005,
                new Persona("Laura", "Torres", "43441029"));
        param[3] = new Mascota(1003, "Pochi", new Raza("Ruso", new Especie("Hamster")), 2009,
                new Persona("Rodriguez", "Elbio", "25962170"));
        param[4] = new Mascota(1004, "Ruffo", new Raza("Dobermann", new Especie("Perro")), 2007,
                new Persona("Confalonieri", "Juan", "40692538"));
        param[5] = new Mascota(1005, "Pepe", new Raza("Cariamarillo", new Especie("Loro")), 2014,
                new Persona("Confalonieri", "Juan", "40692538"));
        param[6] = new Mascota(1006, "Pochi", new Raza("Europeo", new Especie("Conejo")), 2011,
                new Persona("Rodriguez", "Elbio", "25962170"));

        System.out.println("");
        System.out.println("Listado de Mascotas");
        imprimir(param);
        System.out.println("");
        System.out.println("Mascotas mayores de 13 años: ");
        imprimir(filtrarGerontes(param));
        System.out.println("");
        System.out.println("Mascotas de la especie 'Gato': ");
        imprimir(filtrarPorEspecie(param, new Especie("Gato")));
        System.out.println("");
        System.out.println("Persona con mas mascotas: ");
        System.out.println(maxMascotero(param).toString());
    }

    private static void imprimir(Mascota[] param) {
        for (int i = 0; i < param.length; i++) {
            if (param[i] != null) {
                System.out.println(param[i].toString());
            }
        }
    }

    private static Mascota[] filtrarGerontes(Mascota[] param) {
        Mascota[] mayor13 = new Mascota[param.length];

        for (int i = 0; i < param.length; i++) {
            if ((2021 - param[i].anioNacimiento) > 13) {
                mayor13[i] = param[i];
            }
        }
        return mayor13;
    }

    private static Mascota[] filtrarPorEspecie(Mascota[] param, Especie especieParam) {
        Mascota[] retorno = new Mascota[param.length];

        for (int i = 0; i < param.length; i++) {
            if (param[i].getRaza().getEspecie().equals(especieParam)) {
                retorno[i] = param[i];
            }
        }
        return retorno;
    }

    private static Persona maxMascotero(Mascota[] param) {
        Persona duenioMasAnimales = null;
        int cantAnimales = 0;
        int cantMomentaneo;

        for (int i = 0; i < param.length; i++) {
            cantMomentaneo = 1;
            if (param[i].getDuenio().equals(duenioMasAnimales)) {
                continue;
            } else {
                for (int j = i + 1; j < param.length; j++) {
                    if (param[i].getDuenio().equals(param[j].getDuenio())) {
                        cantMomentaneo++;
                    }
                }
                if (i == 0) {
                    duenioMasAnimales = param[i].getDuenio();
                    cantAnimales = cantMomentaneo;
                } else if (cantMomentaneo > cantAnimales) {
                    duenioMasAnimales = param[i].getDuenio();
                    cantAnimales = cantMomentaneo;
                }
                if (cantAnimales > param.length / 2) {// Se nos ocurrio ponerlo, ya que si un dueño tiene mas de la
                                                      // mitad de las mascotas del array, es el que mas mascotas tiene
                    break;
                }
            }
        }
        return duenioMasAnimales;
    }
}