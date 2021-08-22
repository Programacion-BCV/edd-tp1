package com.programacion_bcd.ejercicio3;

import java.util.Objects;

public class Persona {
    String apellido;
    String nombre;
    String documento;

    public Persona(String apellido, String nombre, String documento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.documento);
        return hash;
    }

    @Override
    public String toString() {
        return ("Dueño: " + "\n" + "~Apellido: " + this.apellido + "\n" + "~Nombre: " + this.nombre + "\n"
                + "~Documento: " + this.documento);
    }

}
