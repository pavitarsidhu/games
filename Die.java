public class Die {

  private int upperBound = 6;
  private int lowerBound = 1;

  public void Die (int lowerBound, int upperBound) {
    this.upperBound = upperBound;
    this.lowerBound = this.lowerBound;
  }

  public int getDiceRoll() {
    // return a random number between 1 and 6 (mimic dice roll)
    return (int) (Math.random() * (this.upperBound - 1)) + this.lowerBound;
  }

}