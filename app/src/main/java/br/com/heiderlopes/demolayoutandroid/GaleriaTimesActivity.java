package br.com.heiderlopes.demolayoutandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import br.com.heiderlopes.demolayoutandroid.R;
import br.com.heiderlopes.demolayoutandroid.adapter.ImagemAdapter;


public class GaleriaTimesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        GridView gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setAdapter(new ImagemAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                // Enviar imagem para a activity grande
                Intent i = new Intent(getApplicationContext(), DetalheImagemActivity.class);
                // Passa o valor do indice do array
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}
