package models.Pieces;

import models.Board.Cell;
import models.Helpers.Color;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    private boolean killed;
    private final Color color;
    private final PieceName pieceName;
    private List<Move> movesDone;

    public Piece(PieceName pieceName,Color color) {
        this.killed = false;
        this.pieceName = pieceName;
        this.color = color;
        this.movesDone = new ArrayList<>();
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

    public PieceName getPieceName() {
        return pieceName;
    }

    public boolean isFirstMove() {
        return movesDone.isEmpty();
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
}
