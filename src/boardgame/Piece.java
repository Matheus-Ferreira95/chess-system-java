package boardgame;

public class Piece {
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

	
	

}
