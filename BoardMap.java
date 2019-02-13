public class BoardMap {
  private int[] boardMap;

  public void BoardMap() {
    this.boardMap = new int[]{0,0,0,0,0,-3,3,-5,4,0,0, 3, 4, -5, -4, 0,0,0,0,0,0,0,0,0,-4,4,0,0};
  }

  public void BoardMap(int[] boardMap) {
    this.boardMap = boardMap;
  }

  private int[] getMap()() {
    return this.boardMap;
  }
}