package org.example.ejercicio1tp2;

public class Charla extends Actividad {


    public Charla(int cupoMaximo, String titulo, int id, String disertante) {
        super(cupoMaximo, titulo, id);
        this.disertante = disertante;
    }

    public Charla(int cupoMaximo, String titulo, int id) {
        super(cupoMaximo, titulo, id);
    }

    private String disertante;



    @Override
    public String getTipo() {
        return super.getTipo();
    }
    @Override
    public double calcularCostoMateriales() {
        return 0.0;
    }


}
