package co.edu.unipiloto.listviewsandadapters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EvaluacionesActivity extends Activity {

    public static final String EXTRA_EVALUACIONID = "evaluacionId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluaciones2);

        int evaluacionId = getIntent().getIntExtra(EXTRA_EVALUACIONID, 0);
        Evaluacion evaluacion = Evaluacion.evaluaciones[evaluacionId];

        TextView nombre = findViewById(R.id.nombre);
        nombre.setText(evaluacion.getNombre());
        TextView descripcion = findViewById(R.id.descripcion);
        descripcion.setText(evaluacion.getDescripcion());
        TextView puntaje = findViewById(R.id.puntaje);
        puntaje.setText(String.valueOf(evaluacion.getPuntaje()));
        TextView fecha = findViewById(R.id.fecha);
        fecha.setText(evaluacion.getFecha());
    }
}
