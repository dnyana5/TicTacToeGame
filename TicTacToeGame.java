package TicTacToe;
public class TicTacToeGame {
	char[] board;
public void assignBoard() 
	{
		board = new char[10];
		for (int i = 1 ; i < 10 ; i++ ) {
			board[i] = ' ';
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");
		TicTacToeGame game = new TicTacToeGame();
		game.assignBoard();
	}
}
