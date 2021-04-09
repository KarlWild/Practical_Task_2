package com.company.secondtask;

public interface PlayerPossibilities {
    /**
     * устанавливает количество набранных очков за раунд
     * @param roundPoints количество набранных очков
     */
    void setRoundPoints(int roundPoints);

    /**
     * возвращает количество очков за текущий раунд
     * @return int roundPoints
     */
    int getRoundPoints();

    /**
     * возвращает имя игрока
     * @return String name
     */
    String getName();

    /**
     * возвращает количество выигранных раундов
     * @return int wins
     */
    int getWins();

    /**
     * устанавливает коиличество побед в раундах за игру
     */
    void setWins();

    /**
     * Метод бросания кости K раз
     * @param K - количество бросков кости за раунд
     */
    void throwDice(int K);
}
