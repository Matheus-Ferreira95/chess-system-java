package boardgame;

public abstract class  Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {		
		this.board = board;
	}
	/* a posi��o de uma pe�a rec�m criada ser� considera null,
	  dizendo que a pe�a ainda n�o foi colocada no tabuleiro
	 */

	protected Board getBoard() { // ser� usado apenas para a camada interna de tabuleiro, por isso protected
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;					
				}
								
			}
		}
		return false;
	}
	
	
	

}
