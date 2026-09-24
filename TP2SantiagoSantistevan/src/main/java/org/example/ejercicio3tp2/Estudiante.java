package org.example.ejercicio3tp2;

public class Estudiante {
    private String nombre;
    private String legajo;


    public Estudiante(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;

    }

    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }
}
