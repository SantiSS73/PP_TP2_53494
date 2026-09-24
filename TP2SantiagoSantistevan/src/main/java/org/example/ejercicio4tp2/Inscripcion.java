package org.example.ejercicio4tp2;

import java.time.LocalDate;

public class Inscripcion {
    private LocalDate fecha;
    private String estado;
    private Estudiante estudiante;
    private TicketdeAcceso ticketdeAcceso;
    public static class TicketdeAcceso{
        private String idTicket;
        private LocalDate fechaEmision;

        public void enviarTicket(){
            System.out.println("Ticket: " + idTicket);
            System.out.println("Fecha de Emision: " + fechaEmision);
        }

        public TicketdeAcceso(String idTicket, LocalDate fechaEmision) {
            this.idTicket = idTicket;
            this.fechaEmision = fechaEmision;
        }
    }

    public Inscripcion(TicketdeAcceso ticketdeAcceso, Estudiante estudiante, String estado, LocalDate fecha) {
        this.ticketdeAcceso = ticketdeAcceso;
        this.estudiante = estudiante;
        this.estado = estado;
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public TicketdeAcceso getTicketdeAcceso() {
        return ticketdeAcceso;
    }

}
