package com.example.myskasc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String data1[], data2[];
    int images[];
    Context context;
    public MyAdapter(Context ct,String s1[], String s2[],int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images =img;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myimage.setImageResource(images[position]);
        holder.textView.setText(data2[position]);
    }

    @Override
    public int getItemCount() {

        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
             TextView textView;
            ImageView myimage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            myimage = itemView.findViewById(R.id.myImageView);

        }
    }
    }

