package models.Pieces;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;

public interface ChessPiece {
    void makeMove(Cell startCell,Cell endCell,ChessBoard board);
    void setKilled(boolean killed);
    boolean canMove(Cell startCell, Cell endCell, ChessBoard board);
    boolean isKilled();
    void listPossibleMoves(Cell currentCell);
    boolean isFirstMove();
    Color getColor();
    String getPieceSymbol();
}
