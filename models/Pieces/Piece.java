package models.Pieces;

import models.Helpers.Color;

public abstract class Piece {
    private boolean killed;
    private final Color color;
    private final PieceName pieceName;

    public Piece(PieceName pieceName,Color color) {
        this.killed = false;
        this.pieceName = pieceName;
        this.color = color;
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
}
