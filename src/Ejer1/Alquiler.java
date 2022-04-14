package Ejer1;

import java.time.LocalDate;

public class Alquiler {
    private Pelicula peli;
    private Cliente client;
    private LocalDate fechaAlquilada;
    private LocalDate fechaIngreso;

    public Alquiler(Pelicula peli, Cliente client, LocalDate fechaAlquilada, LocalDate fechaIngreso) {
        this.peli = peli;
        this.client = client;
        this.fechaAlquilada = fechaAlquilada;
        this.fechaIngreso = fechaIngreso;
        peli.incrementarVecesAlquiladas();
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public LocalDate getFechaAlquilada() {
        return fechaAlquilada;
    }

    public void setFechaAlquilada(LocalDate fechaAlquilada) {
        this.fechaAlquilada = fechaAlquilada;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "peli=" + peli +
                ", client=" + client +
                ", fechaAlquilada=" + fechaAlquilada +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
