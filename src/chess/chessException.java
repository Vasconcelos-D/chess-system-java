package chess;

import boardgame.Board;

public class chessException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public chessException(String msg) {
		super(msg);
	}

}
