package org.example.ejercicio4tp2;

public class EnvioTicketsThread extends Thread{
    public EventoUniversitario evento;

    public EnvioTicketsThread(EventoUniversitario evento) {
        this.evento = evento;
    }

    @Override
    public void run() {
    }

    @Override
    public synchronized void start() {
        while(true) {
            try {
                for(Actividad actividad : evento.actividades){
                    for (Inscripcion inscripcion : actividad.inscripciones){
                        inscripcion.getTicketdeAcceso().enviarTicket();
                    }
                }
                Thread.sleep(6700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
