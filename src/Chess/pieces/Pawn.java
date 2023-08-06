package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class Pawn extends ChessPiece {

	public Pawn(Board boad, Color color) {
		super(boad, color);
	}
	
	@Override
	public String toString() {
		return "P";
	}

}
