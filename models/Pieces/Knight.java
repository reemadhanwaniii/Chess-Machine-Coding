package models.Pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.Strategy.DiagonalMovementStrategy;
import models.Pieces.Strategy.KnightMovementStrategy;
import models.Pieces.Strategy.PawnVerticalMovementStrategy;

import java.util.Arrays;

public class Knight extends Piece implements ChessPiece{
    public Knight(PieceName pieceName, Color pieceColor, String pieceSymbol) {
        super(pieceName,pieceColor,pieceSymbol);
        this.movementStrategies = Arrays.asList(new KnightMovementStrategy());
    }
    @Override
    public void makeMove(Cell startingCell, Cell endingCell) {

    }

    @Override
    public boolean canMove(Cell startingCell, Cell endingCell, ChessBoard board) {

        if(super.canMove(startingCell, endingCell, board)) {
            return true;
        }

        throw new InvalidPieceMoveException("Invalid move for Bishop");
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }
}
