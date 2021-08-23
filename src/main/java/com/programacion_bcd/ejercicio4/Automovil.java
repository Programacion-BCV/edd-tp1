
package com.programacion_bcd.ejercicio4;

import java.util.Objects;
import java.math.BigDecimal;

public class Automovil {

    private String Matricula;
    private Tipo tipo;
    private Marca marca;
    private int anio;
    private BigDecimal valuacion;

    public Automovil() {
    }

    public Automovil(String Matricula, Tipo tipo, Marca marca, int anio,BigDecimal valuacion) {
        this.Matricula = Matricula;
        this.tipo = tipo;
        this.marca = marca;
        this.anio = anio;
        this.valuacion=valuacion;
    }

    public String getMatricula() {
        return Matricula;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public BigDecimal getValuacion() {
        return valuacion;
    }

    public void setValuacion(BigDecimal valuacion) {
        this.valuacion = valuacion;
    }

    @Override
    public String toString() {
        return "Automovil{" + "Matricula=" + Matricula + ", tipo=" + tipo + ", marca=" + marca + ", anio=" + anio + ", valuacion=" + valuacion + '}';
    }
    

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.anio;
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
        final Automovil other = (Automovil) obj;
        if (this.anio != other.anio) {
            return false;
        }
        return true;
    }

}
