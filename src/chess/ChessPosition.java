package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}

	public void setColumn(char column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() { // vai converter o ChessPosition para posicao normal de matriz
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) { // converter posicao de matriz para xadrez
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row; // sem a string vazia o compilador n�o vai entender 
	}

}
