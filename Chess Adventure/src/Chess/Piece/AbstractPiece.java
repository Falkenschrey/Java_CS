package Chess.Piece;

import Chess.Squares.Square;

public abstract class AbstractPiece {
    protected String name;
    protected PieceColour pieceColour;
    protected Square currentSquare;

    public AbstractPiece(PieceColour pieceColour) {
        this.pieceColour = pieceColour;
    }

    public String getName() {
        return name;
    }

    public PieceColour getPieceColour() {
        return pieceColour;
    }

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(Square currentSquare) {
        this.currentSquare = currentSquare;
    }

    @Override
    public String toString() {
        return "AbstractPiece{" +
                "name='" + name + '\'' +
                ", pieceColour=" + pieceColour +
                ", currentSquare=" + currentSquare +
                '}';
    }
}
