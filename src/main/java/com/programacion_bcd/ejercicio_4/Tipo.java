
package com.programacion_bcd.ejercicio_4;

import java.util.Objects;

public class Tipo {
    private String descripcion;

    public Tipo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tipo{" + "descripcion=" + descripcion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.descripcion);
        return hash;
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
        final Tipo other = (Tipo) obj;
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return true;
    }

}
