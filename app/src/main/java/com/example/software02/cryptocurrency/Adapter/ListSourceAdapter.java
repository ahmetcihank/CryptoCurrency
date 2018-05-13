package com.example.software02.cryptocurrency.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.software02.cryptocurrency.Interface.ItemClickListener;
import com.example.software02.cryptocurrency.Model.RootObject;
import com.example.software02.cryptocurrency.R;

import java.util.List;

/**
 * Created by SOFTWARE02 on 3/16/2018.
 */

public class ListSourceAdapter  extends RecyclerView.Adapter<ListSourceHolder>

{

    public interface onListClickedRowListner {
        void onListSelected(String name, String Id,String usd, String dailyChangeRate,
                            String hourChangeRate, String weeklyChangeRate);
    }

    List<RootObject> rootObjects = null;
    Context mContext = null;
    onListClickedRowListner onListClickedRowListner;


    public ListSourceAdapter(List<RootObject> rootObjects, Context mContext, onListClickedRowListner onListClickedRowListner)
    {
        this.rootObjects = rootObjects;
        this.mContext = mContext;
        this.onListClickedRowListner = onListClickedRowListner;
    }

    @Override
    public ListSourceHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.main_list_source, parent, false);
        return  new ListSourceHolder(view);
    }

    @Override
    public void onBindViewHolder(ListSourceHolder holder, int position) {
              holder.NameOfCrypto.setText(rootObjects.get(position).getName());
              holder.IdOfCrypto.setText(rootObjects.get(position).getId());
              holder.setItemClickListener(new ItemClickListener() {
                  @Override
                  public void onClick(View view, int position, boolean isLongClick) {

                      onListClickedRowListner.onListSelected(rootObjects.get(position).getName(),
                              rootObjects.get(position).getId(),rootObjects.get(position).getPrice_usd(),
                              rootObjects.get(position).getPercent_change_24h(),
                              rootObjects.get(position).getPercent_change_1h(),rootObjects.get(position).getPercent_change_7d());

                  }
              });
    }

    @Override
    public int getItemCount() {
        return rootObjects.size();
    }






}
