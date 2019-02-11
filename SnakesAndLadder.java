import Game;

public class SnakesAndLadder {
  public static void main (String[] args) {
    Game game = new Game(new Dice(1,6), new Board(), new Player("Pav"), new Player("James"));
    game.startGame();
  }
}