package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class Bishop extends ChessPiece{

	public Bishop(Board boad, Color color) {
		super(boad, color);
	}
	
	@Override
	public String toString() {
		return "B";
	}

}
