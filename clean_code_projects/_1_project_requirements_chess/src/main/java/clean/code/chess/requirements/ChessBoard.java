package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(isValidStartPosition(xCoordinate,yCoordinate,pieceColor) && pieces[xCoordinate][yCoordinate]==null)
        {
            pawn.setYCoordinate(yCoordinate);
            pawn.setXCoordinate(xCoordinate);
            pieces[xCoordinate][yCoordinate]=pawn;
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if (xCoordinate>=0 && xCoordinate<=ChessBoard.MAX_BOARD_HEIGHT && yCoordinate>=0 && yCoordinate<=ChessBoard.MAX_BOARD_WIDTH) return true;
        return false;
    }
     private boolean isValidStartPosition(int x,int y,PieceColor pieceColor)
     {
         if(PieceColor.BLACK.equals(pieceColor))
         {
            return
                    (y>=0 && y<=7)  && x==ChessBoard.MAX_BOARD_HEIGHT-1;

         }
         return
                 (y>=0 && y<=7) && x==1;

     }
}
