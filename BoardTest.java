import Player;
import Board;

public class BoardTest {
  public boolean testComputeMove() {
    Board board = new Board(new int[]{0,0,0,0,4,-3,3,-5,0,0,0, 3, 4, -5, -4, 0,0,0,0,0,0,0,0,0,-4,4,0,0});
    Player player = new Player("TEST");
    board.computeMove(4, player);

    if (player.getCurrentLocation() != 9) {
      return false;
    }
    
    return true;
  }
}