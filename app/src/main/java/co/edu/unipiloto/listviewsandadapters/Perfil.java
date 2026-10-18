package co.edu.unipiloto.listviewsandadapters;

public class Perfil {
    private int imageResourceId;
    private String nombre;
    private String descripcion;
    private String pais;

    public static final Perfil[] perfiles = {
            new Perfil(R.drawable.mentum_logo, "Juan Pérez", "Estudiante de Ingeniería de Sistemas", "Colombia"),
            new Perfil(R.drawable.claude, "María Gómez", "Profesora de Inteligencia Artificial", "España")
    };

    private Perfil(int imageResourceId, String nombre, String descripcion, String pais) {
        this.imageResourceId = imageResourceId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pais = pais;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
