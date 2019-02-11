public class Game {

  private Dice die;
  private Board board;
  private Player playerOne;
  private Playe playerTwo;

  public void Game (Dice die, Board board, Player playerOne, Player playerTwo) {
    this.die = die;
    this.board = board;
    this.playerOne = playerOne;
    this.playerTwo = playerTwo;

    this.board.setPlayerOne(this.playerOne);
    this.board.setPlayerTwo(this.playerTwo);
  }

  public void startGame() {
    while (true) {
      if (this.board.computeMove()) {
        break;
      }
    }
  }
}