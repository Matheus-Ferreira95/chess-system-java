package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {		
		this.board = board;
	}
	/* a posição de uma peça recém criada será considera null,
	  dizendo que a peça ainda não foi colocada no tabuleiro
	 */

	protected Board getBoard() { // será usado apenas para a camada interna de tabuleiro, por isso protected
		return board;
	}

	
	

}
