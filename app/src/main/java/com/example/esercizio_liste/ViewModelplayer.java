package com.example.esercizio_liste;

import androidx.lifecycle.ViewModel;

public class ViewModelplayer extends ViewModel {

    private ModelPlayer modelPlayer;

    public ViewModelplayer() {
        super();
        modelPlayer = new ModelPlayer();
        modelPlayer.simulateLoadData();
    }

    public int getPlayersCount() {
        return modelPlayer.getPlayersCount();
    }

    /*public ModelPlayer getPlayer(int position) {
        return modelPlayer.getPlayer(position);
    }*/

    public String getName(int position) {
        return modelPlayer.getName(position);
    }


}
