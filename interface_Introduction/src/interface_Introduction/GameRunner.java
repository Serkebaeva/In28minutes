package interface_Introduction;

public class GameRunner {

	public static void main(String[] args) {
		// GamingConsole game = new MarioGame();
		GamingConsole game = new ChessGame();
		// ChessGame game = new ChessGame();
		// MarioGame game = new MarioGame();

		game.up();
		game.down();
		game.left();
		game.right();

	}

}
