package co.edu.unipiloto.listviewsandadapters;

public class Curso {
    private String nombre;
    private String descripcion;
    private int imageResourceId;

    public static final Curso[] cursos = {
            new Curso("Mecánica avanzada", "Curso de mecánica avanzada tier 3", R.drawable.mecanica),
            new Curso("IA Claude", "Curso de Prompting para Claude", R.drawable.claude),
            new Curso("Estructuras de datos", "Curso de estructuras de datos tier 1", R.drawable.estdatos)
    };

    private Curso(String nombre, String descripcion, int imageResourceId){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imageResourceId = imageResourceId;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public String getNombre(){
        return nombre;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.nombre;
    }
}
