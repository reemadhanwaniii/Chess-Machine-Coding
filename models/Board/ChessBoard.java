package models.Board;

import game.BoardGame;
import models.Pieces.ChessPiece;
import models.Pieces.Move;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChessBoard implements Board {

    private static final int rc = 8;
    private static final int cc = 8;
    private final List<List<Cell>> board;

    public ChessBoard() {
        this.board = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < 8; j++) {
                row.add(new Cell(i,(char)(j + 'a')));
            }
            this.board.add(row);
        }
    }

    @Override
    public void display() {
        for(int r=0;r<rc;r++) {
            for(int c=0;c<cc;c++) {
                if(board.get(r).get(c).hasPiece()) {
                    System.out.print(board.get(r).get(c).getPiece().get().getPieceSymbol() + " | ");
                }else {
                    System.out.print(" ___ | ");
                }
            }
            System.out.println();
         }
    }

    @Override
    public void applyMove(Move move) {

    }

    @Override
    public void setPiece(ChessPiece chessPiece,int r,char c) {
        board.get(r).get(c-'a').setPiece(chessPiece);
    }
}
