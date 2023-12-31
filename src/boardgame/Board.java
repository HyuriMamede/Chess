package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		//verifica a qnt de linha
		if (rows<1 || columns < 1) {
			throw new BoardException(
					"[INFOR] - erro ao criar tabuleiro, precisar ter ao menos 1 linha e uma coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

//	public void setRows(int rows) {
//		this.rows = rows;
//	} não há motivo para deixar alterarem o tamanho das linhas e colunas

	public int getColumns() {
		return columns;
	}

//	public void setColumns(int columns) {
//		this.columns = columns;
//	}
	
	//acesso a uma peça que está em uma linha e coluna
	public Piece piece(int row, int column) {
		//vrf a position
		if(!positionExists(row,column)) {
			throw new BoardException(
					"Position not on the board");
		}
		return pieces[row][column];
	}
	
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException(
					"Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//metodo que coloca a peça em uma posição
	public void placePiece(Piece piece, Position position) { 
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >=0 && column < columns;
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException(
					"Position not on the board");
		}
		return piece(position) != null;
	}
}