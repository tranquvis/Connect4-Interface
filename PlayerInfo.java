package swe4.connect4.engine_interface;

public interface PlayerInfo {
    int PLAYER1 = 1;
    int PLAYER2 = 2;
    int PLAYER_NONE = -1;

    String getName();

    /**
     * PLAYER1 or PLAYER2
     */
    int getId();
}
