package tatbigy.recyclerviewcardview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CAdapter extends RecyclerView.Adapter<CAdapter.CountryViewHolder>{
    public static class CountryViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView countryname;
        ImageView flagphoto;

        CountryViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cardview);
            countryname = (TextView)itemView.findViewById(R.id.country_name);
            flagphoto = (ImageView)itemView.findViewById(R.id.flag_photo);
        }
    }

    List<Country> countries;

    CAdapter(List<Country> countries){
        this.countries = countries;
    }
    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.items, viewGroup, false);
        return new CountryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CountryViewHolder personViewHolder, int position) {
        personViewHolder.countryname.setText(countries.get(position).Cname);
        personViewHolder.flagphoto.setImageResource(countries.get(position).CphotoId);
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }


 
}