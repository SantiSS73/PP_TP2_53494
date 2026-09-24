package org.example.ejercicio3tp2;

public class Curso extends Actividad implements Certificable {

    private int nivel;

    public Curso(int id, String titulo, int cupoMaximo, int nivel) {
        super(id, titulo, cupoMaximo);
        this.nivel = nivel;

    }
    @Override
    public String getTipo() {
        return super.getTipo();
    }
    @Override
    public double calcularCostoMateriales() {
        return 0.0;
    }
    @Override
    public void generarCertificado(Estudiante estudiante) {
        String certificarTexto = "Certificado para " + estudiante.getNombre() + " de " + ENTIDAD_EMISORA;
        System.out.println(certificarTexto);
    }
}
