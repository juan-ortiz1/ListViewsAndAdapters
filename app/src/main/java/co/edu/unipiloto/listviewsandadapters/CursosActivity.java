package co.edu.unipiloto.listviewsandadapters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CursosActivity extends Activity {
    public static final String EXTRA_CURSOID = "cursoId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos2);
        int cursoId = (Integer) getIntent().getExtras().get(EXTRA_CURSOID);
        Curso curso = Curso.cursos[cursoId];

        TextView nombre = (TextView) findViewById(R.id.nombre);
        nombre.setText(curso.getNombre());
        TextView descripcion = (TextView) findViewById(R.id.descripcion);
        descripcion.setText(curso.getDescripcion());
        ImageView foto = (ImageView) findViewById(R.id.foto);
        foto.setImageResource(curso.getImageResourceId());
        foto.setContentDescription(curso.getNombre());
    }
}