package com.programacion_bcd.ejercicio_3;

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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((documento == null) ? 0 : documento.hashCode());
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
        Persona other = (Persona) obj;
        if (documento == null) {
            if (other.documento != null)
                return false;
        } else if (!documento.equals(other.documento))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return ("Dueño: " + "\n" + "~Apellido: " + this.apellido + "\n" + "~Nombre: " + this.nombre + "\n"
                + "~Documento: " + this.documento);
    }

}
