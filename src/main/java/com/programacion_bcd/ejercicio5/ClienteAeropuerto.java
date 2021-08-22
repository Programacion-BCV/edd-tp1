package com.programacion_bcd.ejercicio5;

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

        LineaAerea l1 = new LineaAerea(990, "American Airlines");
        System.out.println(l1.equals(new LineaAerea(990, "American Airlines")));

    }

    private static void imprimir(Vuelo[] vuelosArray) {
        for (int i = 0; i < vuelosArray.length; i++) {
            if (vuelosArray[i] != null) {
                System.out.println(vuelosArray[i].toString());
            }
        }
    }

    private static Vuelo[] arribos(Vuelo[] vuelosArray) {

        Vuelo[] haciaConcordia = new Vuelo[vuelosArray.length];
        for (int i = 0; i < vuelosArray.length; i++) {
            if (vuelosArray[i].getCiudadDestino().getNombre().compareTo("Concordia") == 0) {
                haciaConcordia[i] = vuelosArray[i];
            }
        }
        return haciaConcordia;

    }

    private static Vuelo[] partidas(Vuelo[] vuelosArray) {

        Vuelo[] desdeConcordia = new Vuelo[vuelosArray.length];
        for (int i = 0; i < vuelosArray.length; i++) {
            if (vuelosArray[i].getCiudadOrigen().getNombre().compareTo("Concordia") == 0) {
                desdeConcordia[i] = vuelosArray[i];
            }
        }
        return desdeConcordia;
    }
}
