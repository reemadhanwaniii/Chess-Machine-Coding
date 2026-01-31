package models.Pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.Helpers.Color;

public class Pawn extends Piece implements ChessPiece {



    public Pawn(PieceName pieceName, Color pieceColor) {
        super(pieceName,pieceColor);
    }

    @Override
    public void makeMove(Cell startCell, Cell endCell) {

    }

//    @Override
//    public void setKilled(boolean killed) {
//         super.setKilled(killed);
//    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        /**
         *   1. If this is the first move then pawn can move one step or two step
         *   2. If this is not the first move then pawn can move only one step
         *   3. If diagonally we have an opposite color piece then pawn can move and kill that piece
         *   4. If diagonally we have an same color piece then pawn can't move
         *   5. If vertically we have a piece then pawn can't move
         *   6. If we have a black pawn then it can move in the negative direction of y-axis and if we have a white pawn
         *   then it can move in the positive direction of y-axis
         */

        if(startCell.getVerticalDistance(endCell) > 2) {
            throw new InvalidPieceMoveException("Invalid move ");
        }
        if(!isFirstMove() && startCell.getVerticalDistance(endCell) == 2) {
            throw new InvalidPieceMoveException("Invalid move from " + startCell + " to " + endCell);
        }

        if(endCell.hasPiece() && !(isMovingDiagonally(startCell, endCell))) {
            throw new InvalidPieceMoveException("Invalid move for pawn");
        }

        if(isMovingHorizontally(startCell, endCell)) {
            throw new InvalidPieceMoveException("Invalid move for pawn");
        }
        return false;
    }

//    @Override
//    public boolean isKilled() {
//        return super.isKilled();
//    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }


}
