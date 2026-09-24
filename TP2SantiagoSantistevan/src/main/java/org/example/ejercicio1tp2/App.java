package org.example.ejercicio1tp2;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class App {

    public static void main(String[] args) throws Exception {

        List<EventoUniversitario> eventos = new ArrayList<>();

        Sala SUM1 = new Sala(67, "SUM1");

        List<Estudiante> estudiantes = new ArrayList<>();

        EventoUniversitario evento1 = new EventoUniversitario("123","Pancheada UTN", 0.0, true);

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

        evento1.crearActividad("Taller",6, "Robotica",3, false, "Pepito");
        evento1.crearActividad("Charla",6, "IA",3, true, "Juancito");

        try{
            evento1.talleres.get(0).inscribir(juan);
            evento1.talleres.get(0).inscribir(marcos);
            evento1.talleres.get(0).inscribir(pepe);
            evento1.talleres.get(0).inscribir(lucas);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println("La cantidad de eventos es " + EventoUniversitario.getCantidadEventos());

        EventosGuarda archivoEvento = new EventosGuarda();

        try {
            for (EventoUniversitario evento : eventos){
                    archivoEvento.guardar(evento);
                    System.out.println("Hola");
            }
            }
            catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

