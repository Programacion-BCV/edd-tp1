package com.programacion_bcd.ejercicio_5;

public class Vuelo {
    private int nroVuelo;
    private LineaAerea lineaAerea;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private FechaHora fechaHoraPartida;
    private FechaHora fechaHoraArribo;

    public Vuelo(int nroVuelo, LineaAerea lineaAerea, Ciudad ciudadOrigen, Ciudad ciudadDestino,
            FechaHora fechaHoraPartida, FechaHora fechaHoraArribo) {
        this.nroVuelo = nroVuelo;
        this.lineaAerea = lineaAerea;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaHoraPartida = fechaHoraPartida;
        this.fechaHoraArribo = fechaHoraArribo;
    }

    public int getNroVuelo() {
        return nroVuelo;
    }

    public void setNroVuelo(int nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public LineaAerea getLineaAerea() {
        return lineaAerea;
    }

    public void setLineaAerea(LineaAerea lineaAerea) {
        this.lineaAerea = lineaAerea;
    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public FechaHora getFechaHoraPartida() {
        return fechaHoraPartida;
    }

    public void setFechaHoraPartida(FechaHora fechaHoraPartida) {
        this.fechaHoraPartida = fechaHoraPartida;
    }

    public FechaHora getFechaHoraArribo() {
        return fechaHoraArribo;
    }

    public void setFechaHoraArribo(FechaHora fechaHoraArribo) {
        this.fechaHoraArribo = fechaHoraArribo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + nroVuelo;
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
        Vuelo other = (Vuelo) obj;
        if (nroVuelo != other.nroVuelo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return ("-----Vuelo-----" + "\n" + "Número de vuelo: " + this.nroVuelo + "\n" + "Línea aerea: " + "\n"
                + this.lineaAerea.toString() + "\n" + "Ciudad de origen: " + "\n" + this.ciudadOrigen.toString() + "\n"
                + "Ciudad de destino: " + "\n" + this.ciudadDestino.toString() + "\n" + "Fecha partida: " + "\n"
                + this.fechaHoraPartida.toString() + "\n" + "Fecha arribo: " + "\n" + this.fechaHoraArribo.toString()
                + "\n" + "-----------------");
    }

}
