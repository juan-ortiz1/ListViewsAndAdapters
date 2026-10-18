package co.edu.unipiloto.listviewsandadapters;

public class Nota {
    private String titulo;
    private String anotaciones;

    public static final Nota[] notas = {
            new Nota("Apuntes IA", "Revisar los conceptos de LLMs y Prompt Engineering."),
            new Nota("Estructuras de Datos", "Estudiar árboles binarios y grafos para el parcial.")
    };

    public Nota(String titulo, String anotaciones) {
        this.titulo = titulo;
        this.anotaciones = anotaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
