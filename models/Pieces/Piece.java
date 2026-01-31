package models.Pieces;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Helpers.Direction;
import models.Pieces.Strategy.MovementStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    private boolean killed;
    private final Color color;
    private final PieceName pieceName;
    private final String pieceSymbol;
    private List<Move> movesDone;
    protected List<MovementStrategy> movementStrategies;

    public Piece(PieceName pieceName,Color color,String pieceSymbol) {
        this.killed = false;
        this.pieceName = pieceName;
        this.color = color;
        this.movesDone = new ArrayList<>();
        this.pieceSymbol = pieceSymbol;
    }

    public boolean isKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public Color getColor() {
        return color;
    }

    public String getColorSymbol() {
    return (color.equals(Color.WHITE) ? "W" : "B");
    }

    public PieceName getPieceName() {
        return pieceName;
    }

    public boolean isFirstMove() {
        return movesDone.isEmpty();
    }


    public String getPieceSymbol() {
//        String pieceName = this.getPieceName().toString();
//        return this.getColorSymbol() + pieceName.toString().substring(0,1)+pieceName.toString().substring(pieceName.length()-1);
        return this.pieceSymbol;
    }

    protected boolean canMove(Cell start, Cell end, ChessBoard board) {
        return movementStrategies.stream().anyMatch(strategy -> strategy.canMove(start, end,board));
    }

    protected boolean isMovingDiagonally(Cell start, Cell end) {
        return start.getVerticalDistance(end) == 1 && start.getHorizontalDistance(end) == 1;
    }

    protected boolean isMovingHorizontally(Cell start,Cell end) {
        return start.getHorizontalDistance(end) == 1 && start.getVerticalDistance(end) == 0;
    }

    protected boolean isMovingVertically(Cell start,Cell end) {
        return start.getVerticalDistance(end) == 1 && start.getHorizontalDistance(end) == 0;
    }

    protected Direction getMovementDirection(Cell start, Cell end) {
        int x = end.getX() - start.getX();
        int y = end.getY() - start.getY();

        if(x == 0 && y == 0) {
            return Direction.NONE;
        }
        if(x == 0){
            return (y > 0) ? Direction.FORWARD_Y : Direction.BACKWARD_Y;
        }
        if(y == 0){
            return (x > 0) ? Direction.FORWARD_X : Direction.BACKWARD_X;
        }
        if(x == 1 && y == 1) {
            return Direction.DIAGONAL_FORWARD_RIGHT;
        }
        if(x == 1 && y == -1) {
            return Direction.DIAGONAL_BACKWARD_RIGHT;
        }
        if(x == -1 && y == 1) {
            return Direction.DIAGONAL_FORWARD_LEFT;
        }
        if(x == -1 && y == -1) {
            return Direction.DIAGONAL_BACKWARD_LEFT;
        }
        return Direction.NONE;
    }
}
