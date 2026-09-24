package org.example.ejercicio2tp2;

public class Taller extends Actividad implements Certificable{

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

    @Override
    public void generarCertificado(Estudiante estudiante) {
        String certificarTexto = "Certificado para " + estudiante.getNombre() + " de " + ENTIDAD_EMISORA;
        System.out.println(certificarTexto);
    }
}
