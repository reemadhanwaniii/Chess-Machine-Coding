package models.Pieces;

import models.Board.Cell;
import models.Helpers.Color;

public class Pawn extends Piece implements ChessPiece {



    public Pawn(PieceName pieceName, Color pieceColor) {
        super(pieceName,pieceColor);
    }

    @Override
    public void makeMove(Cell startCell, Cell endCell) {

    }

    @Override
    public void setKilled(boolean killed) {
         this.setKilled(killed);
    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        return false;
    }

    @Override
    public boolean isKilled() {
        return this.isKilled();
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }
}
