package com.company.secondtask;

public interface Game {
    /**
     * метод самой игры
     */
    void game();

    /**
     * определяет игроков на данную игру
     */
    void setPlayers(Player[] players);
}
