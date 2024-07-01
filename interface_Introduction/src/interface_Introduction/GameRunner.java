package interface_Introduction;

public class GameRunner {

	public static void main(String[] args) {
		// GamingConsole game = new MarioGame();
		// GamingConsole game = new ChessGame();
		// ChessGame game = new ChessGame();
		// MarioGame game = new MarioGame();
		GamingConsole[] games = { new MarioGame(), new ChessGame() };

		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}


	}

}
