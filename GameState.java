package swe4.connect4.engine_interface;

public interface GameState {
    int getColumnCount();
    int getRowCount();
    int getDisc(int column, int row);
    long getLastDropTime();
    int getWinner();
    int getActivePlayerId();
}
