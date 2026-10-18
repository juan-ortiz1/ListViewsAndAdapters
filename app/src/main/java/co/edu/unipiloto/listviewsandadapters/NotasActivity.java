package co.edu.unipiloto.listviewsandadapters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class NotasActivity extends Activity {

    public static final String EXTRA_NOTAID = "notaId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas2);

        int notaId = getIntent().getIntExtra(EXTRA_NOTAID, 0);
        Nota nota = Nota.notas[notaId];

        TextView titulo = findViewById(R.id.titulo);
        titulo.setText(nota.getTitulo());

        EditText anotaciones = findViewById(R.id.anotaciones);
        anotaciones.setText(nota.getAnotaciones());
    }
}
