package com.example.player.repository;

import java.util.ArrayList;

import com.example.player.model.Player;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();
    Player addPlayer(Player player);
    Player getPlayerById(int playerId);
    Player updatePlayer(int playerId,Player player);
    public void deletePlayer(int playerId);
}