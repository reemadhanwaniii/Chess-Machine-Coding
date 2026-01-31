import game.BoardGame;
import game.ChessGame;
import models.Board.Board;
import models.Board.ChessBoard;

public class ChessMain {
    static void main(String[] args) {
//        Board board = new ChessBoard();
//        board.display();

        BoardGame boardGame = new ChessGame(new ChessBoard());
        boardGame.showBoard();
    }
}
