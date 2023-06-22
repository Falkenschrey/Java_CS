package Chess.Piece;

import Chess.Board.Board;
import Chess.Common.Location;
import Chess.Squares.Square;

import java.util.List;

public interface Movable {
    List<Location> getValidMoves(Board board);
    List<Location> getValidMoves(Board board, Square square);
    void makeMove(Square square);
}
