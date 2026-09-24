package org.example.ejercicio4tp2;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        List<EventoUniversitario> eventos = new ArrayList<>();

        Sala SUM1 = new Sala(67, "SUM1");

        List<Estudiante> estudiantes = new ArrayList<>();

        EventoUniversitario evento1 = new EventoUniversitario("123", "Pancheada UTN", 0.0, true);

        eventos.add(evento1);

        evento1.mostrarDatos();

        evento1.asignarSala(SUM1);

        Estudiante juan = new Estudiante("Juan", "1234");
        Estudiante pepe = new Estudiante("Pepe", "4321");
        Estudiante lucas = new Estudiante("Lucas", "0001");
        Estudiante marcos = new Estudiante("Marcos", "0002");

        estudiantes.add(juan);
        estudiantes.add(pepe);
        estudiantes.add(lucas);
        estudiantes.add(marcos);

        evento1.crearActividad(new Taller(6, "Robotica", 3, true));
        evento1.crearActividad(new Taller(66, "Cocina", 3, false));
        evento1.crearActividad(new Charla(7, "IA", 3,"Juancito"));
        evento1.crearActividad(new Curso(8, "POO", 3, 2));

        try {
            evento1.actividades.get(0).inscribir(juan);
            evento1.actividades.get(0).inscribir(marcos);
            evento1.actividades.get(0).inscribir(pepe);
            evento1.actividades.get(0).inscribir(lucas);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        EnvioTicketsThread hilo1 = new EnvioTicketsThread(evento1);

        hilo1.setDaemon(true);
        hilo1.start();

        System.out.println("La cantidad de eventos es " + EventoUniversitario.getCantidadEventos());

        EventosGuarda archivoEvento = new EventosGuarda();


        for (EventoUniversitario evento : eventos) {
            archivoEvento.guardar(evento);
        }

        /*evento1.actividades.get(0).generarCertificado(juan);
        evento1.actividades.get(0).generarCertificado(lucas);*/

        List <Charla> charlas = new ArrayList<>();
        List <Taller> talleres = new ArrayList<>();
        List <Curso> cursos = new ArrayList<>();


        charlas=evento1.filtrarActividadesPorTipo(Charla.class);
        talleres=evento1.filtrarActividadesPorTipo(Taller.class);
        cursos=evento1.filtrarActividadesPorTipo(Curso.class);

        System.out.println(charlas);
        System.out.println(talleres);
        System.out.println(cursos);

        System.out.println("Costo de Charlas: " + evento1.calcularCostoMateriales(charlas));
        System.out.println("Costo de Talleres: " + evento1.calcularCostoMateriales(talleres));
        System.out.println("Costo de Cursos: " + evento1.calcularCostoMateriales(charlas));


    }

}