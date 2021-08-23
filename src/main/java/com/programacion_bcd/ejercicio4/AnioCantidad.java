
package ControlAutomotris;


public class AnioCantidad {
 private int modelo;
 private int cantidad;

    public AnioCantidad() {
    }

    public AnioCantidad(int modelo,int cantidad) {
        this.modelo = modelo;
        this.cantidad = cantidad;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "AnioCantidad{" + "modelo=" + modelo + ", cantidad=" + cantidad + '}';
    }
    
 
 
 
 
}
