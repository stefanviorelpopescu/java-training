package clean.code.chess.requirements;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    // why doesn't Java have bidirectional maps?
    private final Map<Pawn, Position> positionMap;
    private final Map<Position, Pawn> pawnMap;

    public ChessBoard() {
        this.positionMap = new HashMap<>();
        this.pawnMap = new HashMap<>();
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (this.IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            pawn.addPawn(this, xCoordinate, yCoordinate);
        }
    }

    public void setPawnPosition(Pawn pawn, int xCoordinate, int yCoordinate) {
        Position pawnPosition;
        if (this.IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            pawnPosition = new Position(xCoordinate, yCoordinate);
        } else {
            pawnPosition = new Position(-1, -1 );
        }

        this.positionMap.put(pawn, pawnPosition);
        this.pawnMap.put(pawnPosition, pawn);
    }

    public Position getPosition(Pawn pawn) {
        return this.positionMap.get(pawn);
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return checkCoordinatesValidity(xCoordinate, yCoordinate) && isPositionFree(xCoordinate, yCoordinate);
    }

    public boolean checkCoordinatesValidity(int xCoordinate, int yCoordinate) {
        return xCoordinate >= 0 && xCoordinate <= MAX_BOARD_WIDTH && yCoordinate >= 0 && yCoordinate <= MAX_BOARD_HEIGHT;
    }

    public boolean isPositionFree(int xCoordinate, int yCoordinate) {
        return this.pawnMap.get(new Position(xCoordinate, yCoordinate)) == null;
    }
}
