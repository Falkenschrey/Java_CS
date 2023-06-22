package Chess.Board;

import Chess.Common.File;
import Chess.Common.Location;
import Chess.Squares.Square;
import Chess.Squares.SquareColour;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private static final int BOARD_LENGTH = 8;
    private final Map<Location, Square> locationSquareMap;

    Square[][] boardSquares = new Square[BOARD_LENGTH][BOARD_LENGTH];
    public Board() {
        locationSquareMap = new HashMap<>();
        for (int i = 0; i< boardSquares.length;i++) {
            int column = 0;
            SquareColour currentColour = (i % 2 == 0) ? SquareColour.LIGHT : SquareColour.DARK;
            for (File file : File.values()) {
                Square newSquare = new Square(currentColour, new Location(file, BOARD_LENGTH - i));
                locationSquareMap.put(newSquare.getLocation(), newSquare);
                boardSquares[i][column] = newSquare;
                currentColour = (currentColour == SquareColour.DARK) ? SquareColour.LIGHT : SquareColour.DARK;
                column++;
            }
        }
    }

    public Map<Location, Square> getLocationSquareMap() {
        return locationSquareMap;
    }

    public void printBoard() {
        for (Square[] row : boardSquares) {
            for (Square square : row) {
                System.out.print(square);
            }
            System.out.println();
        }
    }

}
