package com.programacion_bcd.ejercicio3;

import java.util.Objects;

public class Especie {
    String nombre;

    public Especie(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Especie)) {
            return false;
        }
        Especie especie = (Especie) o;
        return Objects.equals(nombre, especie.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return "~Nombre: " + this.nombre;
    }

}
