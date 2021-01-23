package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private final PieceColor pieceColor;

    public Pawn( PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public int getXCoordinate() {
        return this.chessBoard.getPosition(this).getxCoordinate();
    }

    public int getYCoordinate() {
        return this.chessBoard.getPosition(this).getyCoordinate();
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    // https://en.wikipedia.org/wiki/Algebraic_notation_(chess) <-- explanation for code below
    public void Move(MovementType movementType, int newX, int newY) {
        int direction;
        if (getPieceColor() == PieceColor.BLACK) {
            direction = -1;
        } else {
            direction = 1;
        }

        if((newX == getXCoordinate() ||
                newX == getXCoordinate() + direction) &&
                (newY == getYCoordinate() ||
                        newY == getYCoordinate() - 1 ||
                        newY == getYCoordinate() + 1)
        ) {
            this.chessBoard.setPawnPosition(this, newX, newY);
        }
    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, this.chessBoard.getPosition(this).getxCoordinate(), this.chessBoard.getPosition(this).getyCoordinate(), pieceColor);
    }

    public void addPawn(ChessBoard chessBoard, int xCoordinate, int yCoordinate) {
        this.chessBoard = chessBoard;
        this.chessBoard.setPawnPosition(this, xCoordinate, yCoordinate);
    }
}
