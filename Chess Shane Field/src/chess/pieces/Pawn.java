package chess.pieces;

import chess.main.Board;

import java.awt.image.BufferedImage;

public class Pawn extends Piece{
    public Pawn(Board board, int col, int row, boolean isWhite) {
        super(board);
        this.col = col;
        this.row = row;
        this.xPos = col * board.tileSize;
        this.yPos = row * board.tileSize;

        this.isWhite = isWhite;
        this.name = "Pawn";

        this.sprite = sheet.getSubimage(5 * sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale)
                .getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);
    }

    public boolean isValidMovement(int col, int row) {
        int colourIndex = isWhite ? 1 : -1;

        //push pawn 1
        if (this.col == col && row == this.row - colourIndex && board.getPiece(col, row) == null)
            return true;
        //push pawn 2
        if (isFirstMove && this.col == col && row == this.row - colourIndex * 2 && board.getPiece(col, row) == null && board.getPiece(col, row + colourIndex) == null)
            return true;
        //capture left
        if (col == this.col - 1 && row == this.row - colourIndex && board.getPiece(col, row) != null)
            return true;
        //capture right
        if (col == this.col + 1 && row == this.row - colourIndex && board.getPiece(col, row) != null)
            return true;
        //en passant left
        if (board.getTileNum(col, row) == board.enPassantTile && col == this.col - 1 && row == this.row - colourIndex && board.getPiece(col, row +colourIndex) != null) {
            return true;
        }
        //en passant right
        if (board.getTileNum(col, row) == board.enPassantTile && col == this.col + 1 && row == this.row - colourIndex && board.getPiece(col, row +colourIndex) != null) {
            return true;
        }

        return false;
    }

}
