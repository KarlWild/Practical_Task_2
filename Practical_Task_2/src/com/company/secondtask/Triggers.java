package com.company.secondtask;

public interface Triggers {
    /**
     *
     * @return index победителя раунда
     */
    int winner();

    /**
     * Сортируем массив игроков так, чтобы победитель раунда бросал первым в следующем раунде
     * @param winnerIndex - индекс победителя раунда
     * @return Player[], отсортированный массив игроков, показывающий очередность ходов
     */
    Player[] sortBeforeNewRound(int winnerIndex);

    /**
     * Возвращаем имя выигрывающего и количество побед
     * @return String[] имя побеждающего и количество побед
     */
    String[] maxWins();
}
