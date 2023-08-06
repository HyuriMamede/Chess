package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class Rook extends ChessPiece{

	public Rook(Board boad, Color color) {
		super(boad, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}
