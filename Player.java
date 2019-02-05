public class Player {

	private int currentLocation = 0;
	private String name;

	public void Player(String name) {
	  this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getCurrentLocation() {
		return this.currentLocation;
	}

	public void setCurrentLocation(int location) {
		this.currentLocation = location;
	}
}