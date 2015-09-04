package br.com.heiderlopes.demolayoutandroid.adapter;

/**
 * Created by Heider on 08/08/2015.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import br.com.heiderlopes.demolayoutandroid.R;

public class ImagemAdapter extends BaseAdapter {
    private Context mContext;

    public Integer[] imagensIds = {
            R.drawable.atl_mineiro, R.drawable.botafogo,
            R.drawable.corinthians, R.drawable.coritiba,
            R.drawable.cruzeiro, R.drawable.figueirense,
            R.drawable.flamengo, R.drawable.fluminense,
            R.drawable.goias, R.drawable.gremio,
            R.drawable.guarani, R.drawable.internacional,
            R.drawable.juventude, R.drawable.palmeiras,
            R.drawable.parana, R.drawable.paranaense,
            R.drawable.paysandu, R.drawable.ponte_preta,
            R.drawable.santos, R.drawable.sao_caetano,
            R.drawable.sao_paulo, R.drawable.vasco_da_gama,
            R.drawable.vitoria
    };

    public ImagemAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return imagensIds.length;
    }

    @Override
    public Object getItem(int position) {
        return imagensIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.imagem_grid, parent, false);
        }

        ImageView ivClube = (ImageView) convertView.findViewById(R.id.ivClube);
        ivClube.setImageResource(imagensIds[position]);

        return convertView;
    }
}