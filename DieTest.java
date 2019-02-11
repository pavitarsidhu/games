import Die;

public class DieTest {
  public boolean testDieLowerAndUpperBound() {
    Die die = new Die(1, 6);
    
    int roll = die.getDiceRoll();
    if (roll < 0 || roll > 6) {
      return false;
    }

    roll = die.getDiceRoll();
    if (roll < 0 || roll > 6) {
      return false;
    }

    if (roll < 0 || roll > 6) {
      return false;
    }        
    return true;
  }
}