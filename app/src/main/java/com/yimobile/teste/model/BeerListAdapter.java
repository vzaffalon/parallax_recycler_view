package com.yimobile.teste.model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;
import com.yimobile.teste.R;
import com.yimobile.teste.controllers.Beer;
import java.util.List;

public class BeerListAdapter extends RecyclerView.Adapter<ListViewHolder> {

    private final Context context;
    private ListOnClickListener listOnClickListener;
    private List<Beer> beers;

    public BeerListAdapter(Context context, List<Beer> beers, ListOnClickListener listOnClickListener){
        this.context=context;
        this.beers = beers;
        this.listOnClickListener = listOnClickListener;
    }


    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
        ListViewHolder holder = new ListViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(final ListViewHolder holder, final int position) {
        Beer beer = beers.get(position);
        holder.tv_name.setText(beer.getName());
        holder.tv_brand.setText(beer.getBrand());
        holder.tv_average_rating.setText(beer.getAverage_rating());
        Picasso.with(context).load(beer.getProfile_picture_medium()).into(holder.profile_picture);

        if(listOnClickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //a variavel position é final
                    listOnClickListener.onClickList(holder.itemView, position);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return this.beers != null ? this.beers.size() : 0;
    }

    //viewholder com as views

    public interface ListOnClickListener{
        public void onClickList(View view, int idx);
    }
}
