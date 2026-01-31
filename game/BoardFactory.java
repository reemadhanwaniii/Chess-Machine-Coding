package game;

import models.Board.Board;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.ChessPiece;
import models.Pieces.Pawn;
import models.Pieces.PieceName;
import models.Pieces.Rook;

import java.time.Period;
import java.util.*;

public class BoardFactory {

    public static void prepareBoardByPlacingPieces(ChessBoard board) {
        Map<PieceName, ChessPiece> whitePieces = getPieces(Color.WHITE);
        Map<PieceName, ChessPiece> blackPeces = getPieces(Color.BLACK);

        placePawns(board, whitePieces, Color.WHITE); // place white pawns
        placePawns(board, blackPeces, Color.BLACK); // place black pawns
    }

    private static void placePawns(ChessBoard board,Map<PieceName, ChessPiece> colorPieces,Color color) {
        int row = (color == Color.WHITE) ? 1 : 6;
        List<PieceName> pawns = Arrays.asList(PieceName.PAWN1, PieceName.PAWN2, PieceName.PAWN3, PieceName.PAWN4,
                PieceName.PAWN5,PieceName.PAWN6,PieceName.PAWN7,PieceName.PAWN8);
        for(int col = 0;col < 8;col++) {
            board.setPiece(colorPieces.get(pawns.get(col)), row, (char)('a' + col));
        }
    }

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
//        pieces.put(PieceName.ROOK1,new Rook(PieceName.ROOK1,color));
//        pieces.put(PieceName.ROOK2,new Rook(PieceName.ROOK2,color));

        return pieces;
    }
}
