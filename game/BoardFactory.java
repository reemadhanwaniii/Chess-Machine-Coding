package game;

import models.Board.Board;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.*;

import java.time.Period;
import java.util.*;

public class BoardFactory {

    public static void prepareBoardByPlacingPieces(ChessBoard board) {
        Map<PieceName, ChessPiece> whitePieces = getPieces(Color.WHITE);
        Map<PieceName, ChessPiece> blackPieces = getPieces(Color.BLACK);

        placePawns(board, whitePieces, Color.WHITE); // place white pawns
        placePawns(board, blackPieces, Color.BLACK); // place black pawns

        placeQueen(board, whitePieces, Color.WHITE);
        placeQueen(board, blackPieces, Color.BLACK);

        placeBishop(board, whitePieces, Color.WHITE);
        placeBishop(board, blackPieces, Color.BLACK);

        placeKing(board, whitePieces, Color.WHITE);
        placeKing(board, blackPieces, Color.BLACK);

        placeRook(board, whitePieces, Color.WHITE);
        placeRook(board, blackPieces, Color.BLACK);

        placeKnight(board, whitePieces, Color.WHITE);
        placeKnight(board, blackPieces, Color.BLACK);
    }

    private static void placePawns(ChessBoard board,Map<PieceName, ChessPiece> colorPieces,Color color) {
        int row = (color == Color.WHITE) ? 1 : 6;
        List<PieceName> pawns = Arrays.asList(PieceName.PAWN1, PieceName.PAWN2, PieceName.PAWN3, PieceName.PAWN4,
                PieceName.PAWN5,PieceName.PAWN6,PieceName.PAWN7,PieceName.PAWN8);
        for(int col = 0;col < 8;col++) {
            board.setPiece(colorPieces.get(pawns.get(col)), row, (char)('a' + col));
        }
    }

    private static void placeQueen(ChessBoard board,Map<PieceName, ChessPiece> colorPieces,Color color) {
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(colorPieces.get(PieceName.QUEEN), row, 'd');
    }

    private static void placeKing(ChessBoard board,Map<PieceName, ChessPiece> colorPieces,Color color){
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(colorPieces.get(PieceName.KING), row, 'e');
    }

    private static void placeBishop(ChessBoard board,Map<PieceName, ChessPiece> colorPieces,Color color){
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(colorPieces.get(PieceName.BISHOP1), row, 'c');
        board.setPiece(colorPieces.get(PieceName.BISHOP2), row, 'f');
    }

    private static void placeKnight(ChessBoard board,Map<PieceName, ChessPiece> colorPieces,Color color){
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(colorPieces.get(PieceName.KNIGHT1), row, 'b');
        board.setPiece(colorPieces.get(PieceName.KNIGHT2), row, 'g');
    }
    private static void placeRook(ChessBoard board,Map<PieceName, ChessPiece> colorPieces,Color color) {
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(colorPieces.get(PieceName.ROOK1), row, 'a');
        board.setPiece(colorPieces.get(PieceName.ROOK2), row, 'h');
    }

    public static Map<PieceName, ChessPiece> getPieces(Color color) {
        Map<PieceName, ChessPiece> pieces = new HashMap<>();

        pieces.put(PieceName.PAWN1, new Pawn(PieceName.PAWN1, color, color.toString().charAt(0) + "P1"));
        pieces.put(PieceName.PAWN2, new Pawn(PieceName.PAWN1, color, color.toString().charAt(0) + "P2"));
        pieces.put(PieceName.PAWN3, new Pawn(PieceName.PAWN1, color, color.toString().charAt(0) + "P3"));
        pieces.put(PieceName.PAWN4, new Pawn(PieceName.PAWN1, color, color.toString().charAt(0) + "P4"));
        pieces.put(PieceName.PAWN5, new Pawn(PieceName.PAWN1, color, color.toString().charAt(0) + "P5"));
        pieces.put(PieceName.PAWN6, new Pawn(PieceName.PAWN1, color, color.toString().charAt(0) + "P6"));
        pieces.put(PieceName.PAWN7, new Pawn(PieceName.PAWN1, color, color.toString().charAt(0) + "P7"));
        pieces.put(PieceName.PAWN8, new Pawn(PieceName.PAWN1, color, color.toString().charAt(0) + "P8"));
        pieces.put(PieceName.ROOK1, new Rook(PieceName.ROOK1,color,color.toString().charAt(0) + "R1"));
        pieces.put(PieceName.ROOK2, new Rook(PieceName.ROOK2,color,color.toString().charAt(0) + "R2"));
        pieces.put(PieceName.QUEEN, new Queen(PieceName.QUEEN,color,color.toString().charAt(0) + "Q1"));
        pieces.put(PieceName.KING, new King(PieceName.KING,color,color.toString().charAt(0) + "K1"));
        pieces.put(PieceName.BISHOP1, new Bishop(PieceName.BISHOP1,color,color.toString().charAt(0) + "B1"));
        pieces.put(PieceName.BISHOP2, new Bishop(PieceName.BISHOP2,color,color.toString().charAt(0) + "B2"));
        pieces.put(PieceName.KNIGHT1, new Knight(PieceName.KNIGHT1,color,color.toString().charAt(0) + "N1"));
        pieces.put(PieceName.KNIGHT2, new Knight(PieceName.KNIGHT2,color,color.toString().charAt(0) + "N2"));

        return pieces;
    }
}
