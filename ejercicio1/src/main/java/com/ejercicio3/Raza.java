package com.ejercicio3;

import java.util.Objects;

public class Raza {
    String nombre;
    Especie especie;

    public Raza(String nombre, Especie especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especie getEspecie() {
        return this.especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Raza)) {
            return false;
        }
        Raza raza = (Raza) o;
        return Objects.equals(nombre, raza.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return ("~Nombre: " + this.nombre + "\n" + "Especie: " + "\n" + this.especie.toString());
    }

}
