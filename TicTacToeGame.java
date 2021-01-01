package TicTacToe;
public class TicTacToeGame {
	char[] board;
	static char playerCharactor,cpuCharactor;
public void assignBoard() 
	{
		board = new char[10];
		for (int i = 1 ; i < 10 ; i++ ) {
			board[i] = ' ';
		}
	}
	public void userInput() {
			System.out.println("select x or o");
			Scanner input = new Scanner(System.in);
			char userInput = input.next().toUpperCase().charAt(0);
			System.out.println(userInput);
			
			if ( 'X' == userInput) {
				playerCharactor = 'X';
				cpuCharactor = 'O';
			}
			else if ('O' == userInput ) {
				cpuCharactor = 'X';
				playerCharactor = 'O';
			}
			else {
				System.out.println("enter a valid choice");
				userInput();
			}
		}
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");
		TicTacToeGame game = new TicTacToeGame();
		game.assignBoard();
		game.userInput();
		System.out.println("player charater is -" +playerCharactor + 
					" computer character is - "+cpuCharactor);
	}
}
