package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {

        // check if x and y are ok
        if (IsLegalBoardPosition(xCoordinate, yCoordinate)) {

            // check if color match with line and avoid duplicate
            if (pieceColor == PieceColor.WHITE && xCoordinate == 1 && pieces[xCoordinate][yCoordinate] == null) {
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                pieces[xCoordinate][yCoordinate] = pawn;
            } else if (pieceColor == PieceColor.BLACK && xCoordinate == 6 && pieces[xCoordinate][yCoordinate] == null) {
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                pieces[xCoordinate][yCoordinate] = pawn;
            } else {
                pawn.setXCoordinate(-1);
                pawn.setYCoordinate(-1);
            }
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return xCoordinate >= 0 && yCoordinate >= 0 && xCoordinate <= MAX_BOARD_HEIGHT && yCoordinate <= MAX_BOARD_WIDTH;
    }
}
