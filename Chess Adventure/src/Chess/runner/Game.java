package Chess.runner;

import Chess.Board.Board;
import Chess.Piece.*;

public class Game {
    public static void main(String[] args) {
        PieceColour colour = PieceColour.DARK;
        Movable pawn = new Pawn(colour);
        Movable rook = new Rook(colour);
        Movable bishop = new Bishop(colour);
        Movable knight = new Knight(colour);
        Movable queen = new Queen(colour);
        Movable king = new King(colour);
        Game.printPiece(pawn);
        Game.printPiece(rook);
        Game.printPiece(bishop);
        Game.printPiece(knight);
        Game.printPiece(queen);
        Game.printPiece(king);
        Board board = new Board();
        board.printBoard();
    }

    public static void printPiece(Movable piece) {
        piece.getValidMoves(null);
    }
}
