package com.example.software02.cryptocurrency.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.software02.cryptocurrency.Interface.ItemClickListener;
import com.example.software02.cryptocurrency.R;

import java.util.jar.Attributes;

/**
 * Created by SOFTWARE02 on 3/16/2018.
 */

public class ListSourceHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView NameOfCrypto = null;
    TextView IdOfCrypto = null;
    ItemClickListener itemClickListener;



    public ListSourceHolder(View itemView) {
        super(itemView);

        NameOfCrypto = (TextView) itemView.findViewById(R.id.crypto_name);
        IdOfCrypto = (TextView) itemView.findViewById(R.id.crypto_id);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }


    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }


}
