import Player;
import java.util.*;
import java.io.*;

public class GameBoard {
  private Player playerOne;
  private Player playerTwo;
  private Player currentPlayer;

  private int max = 30;

  private int[30] boardMap;

  public GameBoard(int[] boardMap) {
    this.boardMap = boardMap;
    this.playerOne = new Player("Player1");
    this.playerTwo = new Player("Player2");
  }

  private void setPlayerOne(Player player) {
    this.playerOne = player;
  }

  private void setPlayerTwo(Player player) {
    this.playerTwo = player;
  }

  private boolean computeMove() {
    int diceRoll = getDiceRoll();
    int currentLocation = this.currentPlayer.getCurrentLocation();
    if (currentLocation + diceRoll > this.max) {
      int overMax = currentLocation + diceRoll - this.max;
      this.currentPlayer.setCurrentLocation(overMax);
    } else {
      this.currentPlayer.setCurrentLocation(currentLocation + diceRoll)
    }

    currentLocation = this.currentPlayer.getCurrentLocation();

    // Check if on a snake or ladder
    if (this.boardMap[currentLocation -1]) {
      this.currentPlayer.setCurrentLocation(currentLocation + this.boardMap[currentLocation -1]);
      currentLocation = this.currentPlayer.getCurrentLocation();
    }
    if (checkWin(currentLocation)) {
      return true;
    }

    this.setNextPlayer();
    return false;
  }

  private void setNextPlayer() {
    if (this.currentPlayer == this.playerOne) {
      this.currentPlayer = this.playerTwo;
    } else {
      this.currentPlayer = this.playerOne;
    }
  }

  private boolean checkWinCondition() {
    if (this.currentPlayer.getCurrentLocation() == 24) {
      return true;
    }
    return false;
  }

  public void startGame() {
    while (true) {
      if (computeMove()) {
        System.out.println("The following player has won : ", this.currentPlayer.getName());
        break;
      }
    }
  }
}