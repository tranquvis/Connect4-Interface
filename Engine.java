package swe4.connect4.engine_interface;

import java.util.Collection;

public interface Engine2 {
    /**
     * Authenticate as player.
     * Player may already exist.
     *
     * If player does not exist and server is not full, the player is registered.
     * @param playerName your player name
     * @return your player info including your id (1 or 2)
     */
    PlayerInfo reserve(String playerName);

    /**
     * Drop disc at column.
     * @param playerName Your name
     * @param column The column
     */
    void dropDisc(String playerName, int column);

    /**
     * Get current state of game.
     * @see GameState
     * @return the game state
     */
    GameState getGameState();

    /**
     * Get all highscores.
     * @return the highscores
     */
    Collection<PlayerPairStatistics> getHighScores();

    /**
     * Get information about player (1 or 2).
     * @param id PlayerInfo.PLAYER1 or PlayerInfo.PLAYER2
     * @return the info
     */
    PlayerInfo getPlayerInfo(int id);

    /**
     * Clear game-state, so the game can be restarted from scratch.
     */
    void resetGame();

    /**
     * Register observer.
     * Observer is notified about any game state change
     * and can then get the new game-state via getGameState.
     * @param observer the observer
     */
    void registerObserver(Observer observer);

    /**
     * Unregister observer.
     * @param observer the observer
     */
    void unregisterObserver(Observer observer);
}
