package com.example.esercizio_liste;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderPlayer  extends RecyclerView.ViewHolder {

    private TextView nameTextView;
    public ViewHolderPlayer(@NonNull View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.name);
    }

    public void bind(String name) {
        this.nameTextView.setText(name);
    }

}
