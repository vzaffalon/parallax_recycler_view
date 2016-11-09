package com.yimobile.teste.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yimobile.teste.R;

/**
 * Created by vzaffalon on 09/11/16.
 */

public class ListViewHolder extends RecyclerView.ViewHolder{
    public TextView tv_name;
    public TextView tv_brand;
    public TextView tv_average_rating;
    public ImageView profile_picture;

    public ListViewHolder(View view){
        super(view);
        tv_name = (TextView) view.findViewById(R.id.tv_name);
        tv_brand = (TextView) view.findViewById(R.id.tv_brand);
        tv_average_rating = (TextView) view.findViewById(R.id.tv_average_rating);
        profile_picture = (ImageView) view.findViewById(R.id.beer_image);
    }
}
