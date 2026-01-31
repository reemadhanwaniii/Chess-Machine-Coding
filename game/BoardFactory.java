package game;

import models.Helpers.Color;
import models.Pieces.ChessPiece;
import models.Pieces.Pawn;
import models.Pieces.PieceName;
import models.Pieces.Rook;

import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class BoardFactory {
    public static Map<PieceName, ChessPiece> getPieces(Color color) {
        Map<PieceName, ChessPiece> pieces = new HashMap<>();

        pieces.put(PieceName.PAWN1,new Pawn(PieceName.PAWN1,color));
        pieces.put(PieceName.PAWN2,new Pawn(PieceName.PAWN2,color));
        pieces.put(PieceName.PAWN3,new Pawn(PieceName.PAWN3,color));
        pieces.put(PieceName.PAWN4,new Pawn(PieceName.PAWN4,color));
        pieces.put(PieceName.PAWN5,new Pawn(PieceName.PAWN5,color));
        pieces.put(PieceName.PAWN6,new Pawn(PieceName.PAWN6,color));
        pieces.put(PieceName.PAWN7,new Pawn(PieceName.PAWN7,color));
        pieces.put(PieceName.PAWN8,new Pawn(PieceName.PAWN8,color));
        pieces.put(PieceName.ROOK1,new Rook(PieceName.ROOK1,color));
        pieces.put(PieceName.ROOK2,new Rook(PieceName.ROOK2,color));
    }
}
