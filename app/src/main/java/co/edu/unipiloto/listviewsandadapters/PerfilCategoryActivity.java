package co.edu.unipiloto.listviewsandadapters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PerfilCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        ArrayAdapter<Perfil> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Perfil.perfiles);
        ListView listPerfil = findViewById(R.id.list_perfil);
        listPerfil.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listPerfil, View itemView, int position, long id) {
                Intent intent = new Intent(PerfilCategoryActivity.this, PerfilActivity.class);
                intent.putExtra(PerfilActivity.EXTRA_PERFILID, (int) id);
                startActivity(intent);
            }
        };
        listPerfil.setOnItemClickListener(itemClickListener);
    }
}
