package game;

import models.Board.Board;

public abstract class BoardGame {

    protected final Board board;

    public BoardGame(Board board) {
        this.board = board;
    }

    public abstract void showBoard();
    protected abstract boolean isGameOver();
    public void startGame() {
//        TODO : implement start of the game
    }


}
