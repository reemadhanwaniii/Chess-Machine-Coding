package models.Pieces;

import models.Board.Cell;

public class Move {
    private final Cell sourceCell;
    private final Cell destinationCell;

    public Move(Cell sourceCell, Cell destinationCell) {
        this.sourceCell = sourceCell;
        this.destinationCell = destinationCell;
    }

    public Cell getSourceCell() {
        return sourceCell;
    }

    public Cell getDestinationCell() {
        return destinationCell;
    }


}
