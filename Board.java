import Player;
import BoardMap;
import java.util.*;
import java.io.*;

public class Board {

  private int max = 30;
  private BoardMap boardMap;

  public void Board(boardMap) {
    this.boardMap = boardMap;
  }

  public boolean computeMove(int diceRoll, Player player) {
    int currentLocation = player.getCurrentLocation();
    if (currentLocation + diceRoll > this.max) {
      int overMax = currentLocation + diceRoll - this.max;
      player.setCurrentLocation(overMax);
    } else {
      player.setCurrentLocation(currentLocation + diceRoll)
    }

    currentLocation = player.getCurrentLocation();

    // Check if on a snake or ladder
    if (this.boardMap.getMap()[currentLocation -1]) {
      player.setCurrentLocation(currentLocation + this.boardMap.getMap()[currentLocation -1]);
      currentLocation = player.getCurrentLocation();
    }
    if (checkWinCondition(player)) {
      return true;
    }

    return false;
  }

  private boolean checkWinCondition(Player player) {
    if (player.getCurrentLocation() == 24) {
      return true
    }
    return false;
  }
}