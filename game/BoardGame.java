package game;

import models.Board.Board;
import models.Pieces.Move;
import models.Players.Player;

import java.util.Queue;

public abstract class BoardGame {

    protected final Board board;
    protected final Queue<Player> players;

    public BoardGame(Board board,Queue<Player> players) {
        this.board = board;
        this.players = players;
    }

    public abstract void showBoard();
    protected abstract boolean isGameOver();
    public void startGame() {
//        TODO : implement start of the game
        while(true) {
            Player current = players.poll(); // get the current player
            // take a move decision from thr player
            Move move = current.makeMove();

            this.board.applyMove(move);

            if(isGameOver()) {
                System.out.println("Game Over");
                System.out.println(current.getName() + " wins");
                break;
            }
            players.add(current); // add the player back to the queue
        }
    }


}
