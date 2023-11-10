package com.example.esercizio_liste;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterPlayer extends RecyclerView.Adapter<ViewHolderPlayer> {

    private LayoutInflater inflater;
    private ViewModelplayer viewModelplayer;

    public AdapterPlayer(Context context, ViewModelplayer viewModelplayer) {
        this.inflater = LayoutInflater.from(context);
        this.viewModelplayer = viewModelplayer;
    }


    @Override
    public ViewHolderPlayer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.single_row, parent, false);
        return new ViewHolderPlayer(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPlayer holder, int position) {
        holder.bind((viewModelplayer.getName(position)));
    }

    @Override
    public int getItemCount() {
        return viewModelplayer.getPlayersCount();
    }
}
