package com.hadimusthafa.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class UI10_RecyclerAdapter extends RecyclerView.Adapter<UI10_RecyclerAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<UI10_ModelRecycler> dataModelArrayList;
    private Context mContext;


    public UI10_RecyclerAdapter(Context ctx, ArrayList<UI10_ModelRecycler> dataModelArrayList) {
        inflater = LayoutInflater.from(ctx);
        this.dataModelArrayList = dataModelArrayList;
        mContext = ctx;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.ui10_rv_list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(dataModelArrayList.get(position).getName());
        holder.message.setText(dataModelArrayList.get(position).getMessage());
        holder.time.setText(dataModelArrayList.get(position).getTime());
        Glide.with(mContext).load(getImage(dataModelArrayList.get(position).getImage())).into(holder.cIv);

    }

    public int getImage(String imageName) {

        int drawableResourceId = mContext.getResources().getIdentifier(imageName, "drawable", mContext.getPackageName());

        return drawableResourceId;
    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        CircleImageView cIv, cIvS;
        TextView name, message, time, nameS;

        public MyViewHolder(final View itemView) {
            super(itemView);
            cIv = itemView.findViewById(R.id.cIv);
            name = itemView.findViewById(R.id.name);
            message = itemView.findViewById(R.id.message);
            time = itemView.findViewById(R.id.time);
            nameS = itemView.findViewById(R.id.nameS);
            cIvS = itemView.findViewById(R.id.cIvS);
        }
    }
}
