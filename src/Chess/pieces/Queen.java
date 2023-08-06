package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class Queen extends ChessPiece{

	public Queen(Board boad, Color color) {
		super(boad, color);
	}

	@Override
	public String toString() {
		return "Q";
	}
}
