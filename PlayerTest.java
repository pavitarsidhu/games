import Player;

public class PlayerTest {
  public boolean testPlayerName() {
    String name = "PavyP";
    Player player = new Player(name);

    if (!player.getName().equals(name)) {
      return false;
    }

    return true;
  }

  public boolean testPlayerLocation() {
    String name = "PavyP";
    Player player = new Player(name);
    int location = 5;
    player.setCurrentLocation(location);

    if (player.getLocation() != location) {
      return false;
    }

    return true;
  }
}