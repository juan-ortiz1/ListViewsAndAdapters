package co.edu.unipiloto.listviewsandadapters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CursosCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
        ArrayAdapter<Curso> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Curso.cursos);
        ListView listCursos = (ListView) findViewById(R.id.list_cursos);
        listCursos.setAdapter(listAdapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listCursos, View itemView, int position, long id) {
                Intent intent = new Intent(CursosCategoryActivity.this, CursosActivity.class);
                intent.putExtra(CursosActivity.EXTRA_CURSOID, (int) id);
                startActivity(intent);
            }
        };
        listCursos.setOnItemClickListener(itemClickListener);
    }
}