package game;

import models.Board.Board;

public abstract class BoardGame {

    private final Board board;

    public BoardGame(Board board) {
        this.board = board;
    }

    protected abstract boolean isGameOver();
    public void startGame() {
//        TODO : implement start of the game
    }


}
