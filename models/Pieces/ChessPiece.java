package models.Pieces;

import models.Board.Cell;

public interface ChessPiece {
    void makeMove(Cell startCell,Cell endCell);
    void setKilled(boolean killed);
    boolean canMove(Cell startCell,Cell endCell);
    boolean isKilled();
    void listPossibleMoves(Cell currentCell);
}
