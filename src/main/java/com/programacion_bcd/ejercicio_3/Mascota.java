package com.programacion_bcd.ejercicio_3;

public class Mascota {
    int nroRegistro;
    String nombre;
    Raza raza;
    int anioNacimiento;
    Persona duenio;

    public Mascota(int nroRegistro, String nombre, Raza raza, int anioNacimiento, Persona duenio) {
        this.nroRegistro = nroRegistro;
        this.nombre = nombre;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.duenio = duenio;
    }

    public int getNroRegistro() {
        return this.nroRegistro;
    }

    public void setNroRegistro(int nroRegistro) {
        this.nroRegistro = nroRegistro;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return this.raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return this.anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public Persona getDuenio() {
        return this.duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + nroRegistro;
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
        Mascota other = (Mascota) obj;
        if (nroRegistro != other.nroRegistro)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return ("-----Mascota-----" + "\n" + "Número de registro: " + this.nroRegistro + "\n" + "Nombre: " + this.nombre
                + "\n" + "Año de nacimiento: " + this.anioNacimiento + "\n" + "Raza: " + "\n" + this.raza.toString()
                + "\n" + this.duenio.toString() + "\n" + "-----------------");
    }

}
