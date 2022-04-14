package Ejer1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cliente {

    ///Atributes
    private String nombre;
    private String telefono;
    private String direccion;


    public Cliente(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefonp() {
        return telefono;
    }

    public void setTelefonp(String telefonp) {
        this.telefono = telefonp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", telefonp='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

}
