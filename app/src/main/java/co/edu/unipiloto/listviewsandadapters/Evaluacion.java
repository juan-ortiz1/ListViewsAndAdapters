package co.edu.unipiloto.listviewsandadapters;

import java.time.LocalDateTime;

public class Evaluacion {
    private String nombre;
    private String descripcion;
    private int puntaje;
    private String fecha;

    public static final Evaluacion[] evaluaciones = {
        new Evaluacion("Mecánica I", "Evaluación de primer corte de mecánica", 5, "20 de octubre de 2026"),
            new Evaluacion("LLMs", "Evaluacion de primer corte de IA", 3, "25 de octubre de 2026")
    };
    private Evaluacion(String nombre, String descripcion, int puntaje, String fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
