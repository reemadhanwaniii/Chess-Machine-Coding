package game;

import models.Board.Board;
import models.Board.ChessBoard;
import models.Helpers.Color;

public class ChessGame extends BoardGame {

    public ChessGame(Board board) {
        super(board);
    }
    @Override
    protected boolean isGameOver() {
        return false;
    }

    private void initBoard() {

    }


}
