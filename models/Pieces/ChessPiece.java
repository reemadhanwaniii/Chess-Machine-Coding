package models.Pieces;

import models.Board.Cell;
import models.Helpers.Color;

public interface ChessPiece {
    void makeMove(Cell startCell,Cell endCell);
    void setKilled(boolean killed);
    boolean canMove(Cell startCell,Cell endCell);
    boolean isKilled();
    void listPossibleMoves(Cell currentCell);
    boolean isFirstMove();
    Color getColor();
}
