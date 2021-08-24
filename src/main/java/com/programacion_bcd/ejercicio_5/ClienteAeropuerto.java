package com.programacion_bcd.ejercicio_5;

public class ClienteAeropuerto {
    public static void main(String[] args) {

        Vuelo[] vuelos = new Vuelo[6];
        vuelos[0] = new Vuelo(0, new LineaAerea(990, "American Airlines"), new Ciudad(9, "Concordia"),
                new Ciudad(2, "Buenos Aires"), new FechaHora("22/08/21", "00:30:00"),
                new FechaHora("22/08/21", "01:00:00"));

        vuelos[1] = new Vuelo(1, new LineaAerea(720, "Aerolineas Argentinas"), new Ciudad(11, "Parana"),
                new Ciudad(9, "Concordia"), new FechaHora("22/08/21", "08:30:00"),
                new FechaHora("22/08/21", "09:10:00"));

        vuelos[2] = new Vuelo(2, new LineaAerea(720, "Aerolineas Argentinas"), new Ciudad(9, "Concordia"),
                new Ciudad(52, "Chajari"), new FechaHora("23/08/21", "15:00:00"),
                new FechaHora("23/08/21", "15:20:00"));

        vuelos[3] = new Vuelo(3, new LineaAerea(510, "British Airways"), new Ciudad(52, "Chajari"),
                new Ciudad(11, "Parana"), new FechaHora("24/08/21", "19:30:00"), new FechaHora("22/08/21", "21:00:00"));

        vuelos[4] = new Vuelo(4, new LineaAerea(990, "American Airlines"), new Ciudad(9, "Concordia"),
                new Ciudad(11, "Parana"), new FechaHora("22/08/21", "04:30:00"), new FechaHora("22/08/21", "05:00:00"));

        vuelos[5] = new Vuelo(5, new LineaAerea(680, "Qatar Airways"), new Ciudad(2, "Buenos Aires"),
                new Ciudad(9, "Concordia"), new FechaHora("23/08/21", "16:30:00"),
                new FechaHora("23/08/21", "17:00:00"));

        System.out.println("");
        System.out.println("Listado de Vuelos");
        imprimir(vuelos);
        System.out.println("");
        System.out.println("Vuelos que salen desde Concordia: ");
        imprimir(partidas(vuelos));
        System.out.println("");
        System.out.println("Vuelos que salen hacia Concordia: ");
        imprimir(arribos(vuelos));

    }

    private static void imprimir(Vuelo[] vuelosArray) {
        for (int i = 0; i < vuelosArray.length; i++) {
            System.out.println(vuelosArray[i].toString());
        }
    }

    private static Vuelo[] arribos(Vuelo[] vuelosArray) {
        Vuelo[] haciaConcordia = new Vuelo[0];

        for (int i = 0; i < vuelosArray.length; i++) {
            if (vuelosArray[i].getCiudadDestino().getNombre().compareTo("Concordia") == 0) {

                Vuelo[] auxVuelos = new Vuelo[haciaConcordia.length + 1];

                for (int j = 0; j < haciaConcordia.length; j++) {
                    auxVuelos[j] = haciaConcordia[j];
                }

                haciaConcordia = auxVuelos;
                haciaConcordia[haciaConcordia.length - 1] = vuelosArray[i];
            }
        }
        return haciaConcordia;

    }

    private static Vuelo[] partidas(Vuelo[] vuelosArray) {
        Vuelo[] desdeConcordia = new Vuelo[0];

        for (int i = 0; i < vuelosArray.length; i++) {
            if (vuelosArray[i].getCiudadOrigen().getNombre().compareTo("Concordia") == 0) {
                Vuelo[] auxVuelos = new Vuelo[desdeConcordia.length + 1];

                for (int j = 0; j < desdeConcordia.length; j++) {
                    auxVuelos[j] = desdeConcordia[j];
                }

                desdeConcordia = auxVuelos;
                desdeConcordia[desdeConcordia.length - 1] = vuelosArray[i];
            }
        }
        return desdeConcordia;
    }
}
