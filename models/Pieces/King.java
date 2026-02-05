package models.Pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.Strategy.DiagonalMovementStrategy;
import models.Pieces.Strategy.HorizontalMovementStrategy;
import models.Pieces.Strategy.KnightMovementStrategy;
import models.Pieces.Strategy.VerticalMovementStrategy;

import java.util.Arrays;

public class King extends Piece implements ChessPiece{
    public King(PieceName pieceName, Color pieceColor,String pieceSymbol) {
        super(pieceName,pieceColor,pieceSymbol);
        this.movementStrategies = Arrays.asList(new VerticalMovementStrategy(),new HorizontalMovementStrategy(),new DiagonalMovementStrategy());
    }
    @Override
    public void makeMove(Cell startingCell, Cell endingCell, ChessBoard board) {

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
