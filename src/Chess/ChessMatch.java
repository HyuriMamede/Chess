package Chess;

import Chess.pieces.Bishop;
import Chess.pieces.Rook;
import boardgame.Board;

public class ChessMatch {

	private Board board;
	
	public ChessMatch()	{
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			
			for (int j=0; j<board.getColumns(); j++) {
				
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}

	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPostion());
	}
	
	private void initialSetup() {
		placeNewPiece('a', 2,new Rook(board, Color.WHITE));
		placeNewPiece('b', 1,new Bishop(board, Color.BLACK));
	}
	
}
