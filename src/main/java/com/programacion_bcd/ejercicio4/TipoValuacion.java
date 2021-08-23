
package com.programacion_bcd.ejercicio4;

import java.math.BigDecimal;


public class TipoValuacion {
    private String tipo;
    private BigDecimal sumaValuacion;

    public TipoValuacion() {
    }

    public TipoValuacion(String tipo, BigDecimal sumaValuacion) {
        this.tipo = tipo;
        this.sumaValuacion = sumaValuacion;
    }

    public String getTipo() {
        return tipo;
    }

    public BigDecimal getSumaValuacion() {
        return sumaValuacion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSumaValuacion(BigDecimal sumaValuacion) {
        this.sumaValuacion = sumaValuacion;
    }

    @Override
    public String toString() {
        return "TipoValuacion{" + "tipo=" + tipo + ", sumaValuacion=" + sumaValuacion + '}';
    }
 
}
