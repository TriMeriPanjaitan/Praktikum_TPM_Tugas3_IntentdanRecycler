package com.example.myapplication3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DramaAdapter extends RecyclerView.Adapter<DramaAdapter.ViewHolder> {
    private Context context;
    private ArrayList<DramaModel> dramaModels;

    public ArrayList<DramaModel> getDramaModels() {
        return dramaModels;
    }

    public void setDramaModels(ArrayList<DramaModel> dramaModels) {
        this.dramaModels = dramaModels;
    }

    public DramaAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public DramaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_drama,parent, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final DramaModel drama = dramaModels.get(position);

        Glide.with(holder.itemView.getContext())
                .load(drama.getGambarDrama())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.ivImage);
        holder.tvNama.setText(drama.getNamaDrama());
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send."+ dramaModels.get(holder.getAdapterPosition()).getDeskripsiDrama());
                sendIntent.setType("text/plain");

                context.startActivity(Intent.createChooser(sendIntent,"send to"));
            }
        });
        holder.detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent(context, DramaDetail.class);
                sendIntent.putExtra("Name", drama.getNamaDrama());
                sendIntent.putExtra("Deskripsi", drama.getDeskripsiDrama());
                sendIntent.putExtra("photo", drama.getGambarDrama());
                context.startActivity(sendIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dramaModels.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivImage;
        private TextView tvNama;
        private Button detail;
        private ImageButton share;
        public ViewHolder (@NonNull View itemView){
            super(itemView);
            ivImage = itemView.findViewById(R.id.image);
            tvNama = itemView.findViewById(R.id.nama);
            detail = itemView.findViewById(R.id.Btndetail);
            share = itemView.findViewById(R.id.Btnshare);
        }
    }
}

