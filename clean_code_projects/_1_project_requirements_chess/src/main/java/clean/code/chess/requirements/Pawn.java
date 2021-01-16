package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {

        // check if newX and newY are on board
        if (IsLegalBoardPosition(newX,newY)) {
            // verify after color of the piece
            if (pieceColor == PieceColor.BLACK) {
                // down
                if (xCoordinate > newX && xCoordinate - newX == 1) {
                    setXCoordinate(newX);
                    setYCoordinate(newY);
                }
                // left or right
                if (yCoordinate > newY && yCoordinate - newY == 1) {
                    setXCoordinate(newX);
                    setYCoordinate(newY);
                }
            } else if (pieceColor == PieceColor.WHITE) {
                // up
                if (xCoordinate < newX && newX - xCoordinate == 1) {
                    setXCoordinate(newX);
                    setYCoordinate(newY);
                }
                // left or right
                if (yCoordinate < newY && newY - yCoordinate == 1) {
                    setXCoordinate(newX);
                    setYCoordinate(newY);
                }
            }
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return xCoordinate >= 0 && yCoordinate >= 0 && xCoordinate <= 7 && yCoordinate <= 7;
    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}
