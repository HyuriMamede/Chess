package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class Horse extends ChessPiece {

	public Horse(Board boad, Color color) {
		super(boad, color);
	}

	@Override
	public String toString() {
		return "H";
	}
}
