package Chess.Piece;

import Chess.Board.Board;
import Chess.Common.Location;
import Chess.Common.LocationFactory;
import Chess.Squares.Square;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pawn extends AbstractPiece implements Movable {

    private boolean isFirstMove = true;

    public Pawn(PieceColour pieceColour) {
        super(pieceColour);
        this.name = "Pawn";
    }

    @Override
    public List<Location> getValidMoves(Board board) {
        List<Location> moveCandidates = Collections.emptyList();
        Location current = this.getCurrentSquare().getLocation();
        moveCandidates.add(LocationFactory.build(current, 0,1));
        if(isFirstMove) {
            moveCandidates.add(LocationFactory.build(current, 0,2));
            return moveCandidates;
        }

        moveCandidates.add(LocationFactory.build(current, 1, 1));
        moveCandidates.add(LocationFactory.build(current, -1, 1));
        Map<Location, Square> squareMap = board.getLocationSquareMap();
        List<Location> validMoves = moveCandidates.stream()
                .filter(squareMap::containsKey)
                .collect(Collectors.toList());

        return validMoves.stream().filter((candidate) ->{
            if(candidate.getFile().equals(this.getCurrentSquare().getLocation().getFile()) &&
                    squareMap.get(candidate).isOccupied()) {
                return false;
            }
            return !squareMap.get(candidate).getCurrentPiece().pieceColour.equals(this.getPieceColour());
        }).collect(Collectors.toList());
    }

    @Override
    public List<Location> getValidMoves(Board board, Square square) {
        return null;
    }

    @Override
    public void makeMove(Square square) {
        System.out.println(this.getName() + "-> makeMove()");
    }
}
