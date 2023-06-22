package Chess.Piece;

import Chess.Board.Board;
import Chess.Common.Location;
import Chess.Squares.Square;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Queen extends AbstractPiece implements Movable{

    private Movable bishop;
    private Movable rook;

    public Queen(PieceColour pieceColour) {
        super(pieceColour);
        this.name = "Queen";
    }

    public Queen(PieceColour pieceColour, Movable bishop, Movable rook) {
        super(pieceColour);
        this.bishop = bishop;
        this.rook = rook;
    }

    @Override
    public List<Location> getValidMoves(Board board) {
        List<Location> moveCandidates = Collections.emptyList();
        moveCandidates.addAll(bishop.getValidMoves(board, this.getCurrentSquare()));
        moveCandidates.addAll(rook.getValidMoves(board, this.getCurrentSquare()));
        return moveCandidates;
    }

    @Override
    public List<Location> getValidMoves(Board board, Square square) {
        return null;
    }

    @Override
    public void makeMove(Square square) {
        Square current = this.getCurrentSquare();
        this.setCurrentSquare(square);
        current.reset();
    }
}

