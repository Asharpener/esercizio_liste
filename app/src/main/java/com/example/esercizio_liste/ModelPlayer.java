package com.example.esercizio_liste;

import java.util.ArrayList;
import java.util.List;

public class ModelPlayer {
    private List<Player> players = new ArrayList<>();

    public ModelPlayer() {
        simulateLoadData();
    }

    public void simulateLoadData() {
        for (int i = 0; i < 40; i++) {
            players.add(new Player("Player " + i, 100-i, 100-i));
        }

    }

    public int getPlayersCount() {
        return players.size();
    }


    public Player getPlayer(int position) {
        return players.get(position);
    }

    public String getName(int position) {
        return players.get(position).getName();
    }
}
