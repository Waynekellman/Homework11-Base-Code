package com.example.rusili.homework11.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rusili.homework11.R;

/**
 * Created by BabiMaji on 12/1/17.
 */

public class PokeViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;

    public PokeViewHolder(View itemView){
        super(itemView);
        imageView = itemView.findViewById(R.id.my_image_view);

    }

}
