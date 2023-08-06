package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class King extends ChessPiece {

	public King(Board boad, Color color) {
		super(boad, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
