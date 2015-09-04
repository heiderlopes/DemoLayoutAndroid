package br.com.heiderlopes.demolayoutandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import br.com.heiderlopes.demolayoutandroid.R;
import br.com.heiderlopes.demolayoutandroid.adapter.ImagemAdapter;

public class DetalheImagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_imagem);

        Intent i = getIntent();
        // Pegamos o id selecionado pelo usuário
        int position = i.getExtras().getInt("id");
        ImagemAdapter imagemAdapter = new ImagemAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.ivImagem);
        imageView.setImageResource(imagemAdapter.imagensIds[position]);
    }
}
