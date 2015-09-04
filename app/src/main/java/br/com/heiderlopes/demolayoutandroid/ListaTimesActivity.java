package br.com.heiderlopes.demolayoutandroid;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import br.com.heiderlopes.demolayoutandroid.R;


public class ListaTimesActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_times);

        String[] clubes = getResources().getStringArray(R.array.clubes_nome);
        setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, clubes));
    }
}
