package Chess.Squares;

import Chess.Common.Location;
import Chess.Piece.AbstractPiece;

public class Square {
    private final SquareColour squareColour;
    private final Location location;
    private boolean isOccupied;
    private AbstractPiece currentPiece;

    public Square(SquareColour squareColour, Location location) {
        this.squareColour = squareColour;
        this.location = location;
        this.isOccupied = false;
    }

    public void reset() {
        this.isOccupied = false;
        this.currentPiece = null;
    }

    public AbstractPiece getCurrentPiece() {
        return currentPiece;
    }

    public void setCurrentPiece(AbstractPiece currentPiece) {
        this.currentPiece = currentPiece;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public SquareColour getSquareColour() {
        return squareColour;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareColour=" + squareColour +
                ", location=" + location +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
