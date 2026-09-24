package org.example.ejercicio1tp2;

import java.io.*;
import java.util.Calendar;
import java.io.FileWriter;
import java.io.File;

public class EventosGuarda {

    private PrintWriter escritor;

    public void guardar(EventoUniversitario evento) throws IOException {
        String carpeta = "eventos";
        File directorio = new File(carpeta);
        if (!directorio.exists()) {
            directorio.mkdirs();
        }
        String nombreArchivoEvento = carpeta + File.separator + evento.getId() + ".txt";
        try {
        System.out.println("Guardando en: " + new File(nombreArchivoEvento).getAbsolutePath());
            PrintWriter escritor = new PrintWriter(new FileWriter(nombreArchivoEvento));
            escritor.println("Nombre: " + evento.getTitulo());
            escritor.println("ID: " + evento.getId());
            escritor.println("Costo Base: " + evento.getCostoBase());
            escritor.println("Sala: " + evento.getSala().getNombre());
            escritor.close();
        }catch(IOException e){
            System.out.println("Error al escribir");
        }
    }

}