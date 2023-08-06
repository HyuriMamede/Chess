package boardgame;

public class Piece {

	protected Position position;
	private Board boad;
	
	public Piece(Board boad) {
		this.boad = boad;
		position = null;
	}

	protected Board getBoad() {
		return boad;
	}

	
}
