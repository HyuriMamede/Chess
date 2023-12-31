package Chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		//char upperCaseColumn = Character.toUpperCase(column);
		if (column < 'a' || column > 'h' || row <1 || row >8) {
			throw new ChessException(
					"Error instantiating ChessPosition. "
					+ "Valid values are from A1 to H8");
		}
		/*
		 * if (upperCaseColumn < 'A' || upperCaseColumn > 'H' || row <1 || row >8) {
		 * throw new ChessException( "Error instantiating ChessPosition. " +
		 * "Valid values are from A1 to H8"); }
		 */
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}
	/*
	 * public void setColumn(char column) { 
	 * this.column = column; 
	 * }
	 */
	public int getRow() {
		return row;
	}
//	public void setRow(int row) {
//		this.row = row;
//	}
	
	protected Position toPostion() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition (
				(char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	
}
