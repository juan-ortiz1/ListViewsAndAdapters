package co.edu.unipiloto.listviewsandadapters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EvaluacionesCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluaciones);
        ArrayAdapter<Evaluacion> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Evaluacion.evaluaciones);
        ListView listEvaluaciones = (ListView) findViewById(R.id.list_evaluaciones);
        listEvaluaciones.setAdapter(listAdapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listEvaluaciones, View itemView, int position, long id) {
                Intent intent = new Intent(EvaluacionesCategoryActivity.this, EvaluacionesActivity.class);
                intent.putExtra(EvaluacionesActivity.EXTRA_EVALUACIONID, (int) id);
                startActivity(intent);
            }
        };
        listEvaluaciones.setOnItemClickListener(itemClickListener);
    }
}