package br.com.heiderlopes.demolayoutandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import br.com.heiderlopes.demolayoutandroid.R;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button btnCadastrar;
    private Button btnGaleria;
    private Button btnLista;
    private Button btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpViews();
        setUpListener();

    }

    private void setUpViews() {
        btnCadastrar = (Button)findViewById(R.id.btnCadastrar);
        btnGaleria = (Button)findViewById(R.id.btnGaleria);
        btnLista = (Button)findViewById(R.id.btnLista);
        btnSair = (Button)findViewById(R.id.btnSair);

    }
    private void setUpListener() {
        btnCadastrar.setOnClickListener(this);
        btnGaleria.setOnClickListener(this);
        btnLista.setOnClickListener(this);
        btnSair.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = null;
        switch (v.getId()) {
            case R.id.btnCadastrar:
                i = new Intent(this, CadastroActivity.class);
                break;
            case R.id.btnGaleria:
                i = new Intent(this, GaleriaTimesActivity.class);
                break;
            case R.id.btnLista:
                i = new Intent(this, ListaTimesActivity.class);
                break;
            case R.id.btnSair:
                finish();
                break;
        }
        if(i != null)
            startActivity(i);
    }
}