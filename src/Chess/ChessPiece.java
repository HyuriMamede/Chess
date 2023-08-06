package Chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board boad, Color color) {
		super(boad);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	
}
