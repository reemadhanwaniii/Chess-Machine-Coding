package models.Pieces.Strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class DiagonalMovementStrategy implements MovementStrategy {

    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
        return Math.abs(start.getX() - end.getX()) == Math.abs(start.getY() - end.getY());
    }
}
