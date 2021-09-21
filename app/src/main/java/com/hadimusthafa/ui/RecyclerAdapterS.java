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

public class RecyclerAdapterS extends RecyclerView.Adapter<RecyclerAdapterS.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<UI10_ModelRecycler> dataModelArrayList;
    private Context mContext;


    public RecyclerAdapterS(Context ctx, ArrayList<UI10_ModelRecycler> dataModelArrayList) {
        inflater = LayoutInflater.from(ctx);
        this.dataModelArrayList = dataModelArrayList;
        mContext = ctx;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.ui10_rv_story_list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.nameS.setText(dataModelArrayList.get(position).getNameS());
        Glide.with(mContext).load(getImage(dataModelArrayList.get(position).getImageS())).into(holder.cIvS);

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

        CircleImageView cIvS;
        TextView nameS;

        public MyViewHolder(final View itemView) {
            super(itemView);
            nameS = itemView.findViewById(R.id.nameS);
            cIvS = itemView.findViewById(R.id.cIvS);
        }
    }
}
