package org.example.ejercicio2tp2;

public class Charla extends Actividad {

    private String disertante;

    public Charla(int cupoMaximo, String titulo, int id, String disertante) {
        super(cupoMaximo, titulo, id);
        this.disertante = disertante;
    }

    public Charla(int cupoMaximo, String titulo, int id) {
        super(cupoMaximo, titulo, id);
    }





    @Override
    public String getTipo() {
        return super.getTipo();
    }
    @Override
    public double calcularCostoMateriales() {
        return 0.0;
    }


}
