import GameBoard;

public class SnakesAndLadder {
	public static void main (String[] args) {
		Gameboard game = new GameBoard(new int[]{0,0,0,0,0,-3,3,-5,4,0,0, 3, 4, -5, -4, 0,0,0,0,0,0,0,0,0,-4,4,0,0});
		game.startGame();
	}
}