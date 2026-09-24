package org.example.ejercicio1tp2;

import java.lang.Exception;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {
    private int id;
    private String titulo;
    private static int cupoMaximo;
    public static final int CUPOMINIMO = 1;
    private static int inscriptos = 0;
    public List<Inscripcion> inscripciones = new ArrayList<>();

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
    }

    public Inscripcion inscribir(Estudiante estudiante){
        if (inscriptos < cupoMaximo) {
            Inscripcion inscripcion = new Inscripcion(LocalDate.now(), "inscripto", estudiante);
            inscripciones.add(inscripcion);
            inscriptos++;
            System.out.println("Se ha inscripto a un alumno");
            System.out.println("Personas Incriptas " + inscriptos);
            return inscripcion;
        } else {
            throw new CupoExcedidoException("Capacidad Maxima Excedida");
        }
    }

    public void mostrarInscripciones() {
        for (Inscripcion inscripcion : inscripciones) {
            System.out.println("Legajo: " + inscripcion.getEstudiante().getLegajo());
            System.out.println("Nombre: " + inscripcion.getEstudiante().getNombre());
        }

    }

    public double calcularCostoMateriales() {
        double costoMateriales = 6.7;
        return costoMateriales;
    }

    public String getTipo() {
        return "hola";
    }
}

