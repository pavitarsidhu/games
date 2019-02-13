public class Game {

  private Dice die;
  private Board board;
  private Player playerOne;
  private Player playerTwo;
  private Player currentPlayer;

  public void Game (Dice die, Board board, Player playerOne, Player playerTwo) {
    this.die = die;
    this.board = board;
    this.playerOne = playerOne;
    this.playerTwo = playerTwo;
  }

  private void setNextPlayer() {
    if (this.currentPlayer == this.playerOne) {
      this.currentPlayer = this.playerTwo;
    } else {
      this.currentPlayer = this.playerOne;
    }
  }

  public void startGame() {
    while (true) {
      if (this.board.computeMove(this.die.getDiceRoll(), this.currentPlayer)) {
        break;
      }
      this.setNextPlayer();
    }
  }

}