package org.example.ejercicio1tp2;

    public class Taller extends Actividad {

    private boolean requiereNoteboo;

    @Override
    public double calcularCostoMateriales() {

        if (requiereNoteboo){
            return 5000.0;
        }
        return 2000.0;
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    public Taller(int id, String titulo, int cupoMaximo, boolean requiereNoteboo) {
        super(id, titulo, cupoMaximo);
        this.requiereNoteboo = requiereNoteboo;
    }

    public boolean isRequiereNoteboo() {
        return requiereNoteboo;
    }
}
