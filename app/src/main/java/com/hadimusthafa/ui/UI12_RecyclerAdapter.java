package com.hadimusthafa.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class UI12_RecyclerAdapter extends RecyclerView.Adapter<UI12_RecyclerAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<UI12_ModelRecycler> dataModelArrayList;
    private Context mContext;


    public UI12_RecyclerAdapter(Context ctx, ArrayList<UI12_ModelRecycler> dataModelArrayList) {
        inflater = LayoutInflater.from(ctx);
        this.dataModelArrayList = dataModelArrayList;
        mContext = ctx;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.ui12_lv, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(dataModelArrayList.get(position).getName());
        holder.mobile.setText(dataModelArrayList.get(position).getMobile());
        Glide.with(mContext).load(getImage(dataModelArrayList.get(position).getImage())).into(holder.cIv);

        holder.call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+dataModelArrayList.get(position).getMobile()));
                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(callIntent);
            }
        });
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
        TextView name, mobile;
        ImageView call;
        CircleImageView cIv;
        public MyViewHolder(final View itemView) {
            super(itemView);
            mobile = itemView.findViewById(R.id.mobile);
            name = itemView.findViewById(R.id.name);
            call = itemView.findViewById(R.id.call);
            cIv = itemView.findViewById(R.id.cIv);
        }
    }
}
