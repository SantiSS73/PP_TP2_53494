package org.example.ejercicio4tp2;

import java.util.ArrayList;
import java.util.List;


public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;
    private Sala sala;
    public List<Actividad> actividades = new ArrayList<>();


    public EventoUniversitario(String id) {
        this.id = id;
    }

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
    }
    public EventoUniversitario(EventoUniversitario obj){
        this.id = obj.id;
        this.titulo = obj.titulo;
        this.costoBase = obj.costoBase;
        this.gratuito = obj.gratuito;
        cantidadEventos++;
    }
     /*public double calcularCostoEstimado(){
        if(gratuito) {
             return 0.0;
         }
         double total = costoBase;

         for(Taller taller: actividades){
             total +=  actividades.calcularCostoMateriales();
         }
         for(Charla charla:  actividades){
             total += charla.calcularCostoMateriales();
         }

         return total * 1.21;

     }*/
    public void asignarSala(Sala sala){
            System.out.println("El evento " + this.titulo + " tiene asignada la sala " + sala.getNombre());
            this.sala = sala;
    }
    public void mostrarDatos(){
        System.out.println("Titulo:  " + this.titulo);
        System.out.println("Costo Base: " + this.costoBase);
        if (gratuito==true){
            System.out.println("Es gratis.");
        } else {
            System.out.println("No es gratis.");
        }
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }

    public void crearActividad(Actividad actividad) {
        actividades.add(actividad);
    }

    public <T extends Actividad> List<T> filtrarActividadesPorTipo(Class<T> tipo) {
        List<T> resultado = new ArrayList<>();
        for (Actividad actividad : actividades) {
            if (tipo.isInstance(actividad)) {
                resultado.add(tipo.cast(actividad));
            }
        }
        return resultado;
    }

    public double calcularCostoMateriales(List<? extends Actividad> actividades){
        double total = 0.0;
        for (int i = 0; i < actividades.size(); i++) {
            total = total + actividades.get(i).calcularCostoMateriales();
        }
        return total;
    }

    public Sala getSala() {
        return sala;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getId() {
        return id;
    }

}

