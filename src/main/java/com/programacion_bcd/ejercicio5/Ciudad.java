package com.programacion_bcd.ejercicio5;

public class Ciudad {
    private int codigoIata;
    private String nombre;

    public Ciudad(int codigoIata, String nombre) {
        this.codigoIata = codigoIata;
        this.nombre = nombre;
    }

    public int getCodigoIata() {
        return codigoIata;
    }

    public void setCodigoIata(int codigoIata) {
        this.codigoIata = codigoIata;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoIata;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ciudad other = (Ciudad) obj;
        if (codigoIata != other.codigoIata)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "~Codigo IATA: " + this.codigoIata + "\n" + "~Nombre: " + this.nombre;
    }

}
