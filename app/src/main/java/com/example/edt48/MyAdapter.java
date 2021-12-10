package com.example.edt48;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Picture> pictures;

    public MyAdapter(Context context, ArrayList<Picture> pictures) {
        this.context = context;
        this.pictures = pictures;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Picasso.get().load(pictures.get(position).getUrl()).fit().centerCrop().into(holder.img);
        //poner imageView de MyAdapter.class interna
        holder.pictitle.setText(pictures.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView pictitle;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            pictitle = itemView.findViewById(R.id.pictitle);


        }
    }



}
