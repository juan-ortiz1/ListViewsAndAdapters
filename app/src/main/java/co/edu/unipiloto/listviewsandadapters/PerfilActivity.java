package co.edu.unipiloto.listviewsandadapters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PerfilActivity extends Activity {

    public static final String EXTRA_PERFILID = "perfilId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil2);

        int perfilId = getIntent().getIntExtra(EXTRA_PERFILID, 0);
        Perfil perfil = Perfil.perfiles[perfilId];

        TextView nombre = findViewById(R.id.nombre);
        nombre.setText(perfil.getNombre());
        TextView descripcion = findViewById(R.id.descripcion);
        descripcion.setText(perfil.getDescripcion());
        TextView pais = findViewById(R.id.pais);
        pais.setText(perfil.getPais());
        ImageView foto = findViewById(R.id.foto);
        foto.setImageResource(perfil.getImageResourceId());
        foto.setContentDescription(perfil.getNombre());
    }
}
