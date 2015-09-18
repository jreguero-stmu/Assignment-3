public class CruiseShip extends Ship{
	
	private int maxPassengers;

	
	public CruiseShip(){
		maxPassengers = 0;
	}
	
	
	public CruiseShip(String shipName, int maxPassengers){
		this.setShipName(shipName);
		this.setMaxPassengers(maxPassengers);
	}
	
	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public String toString() {
		return "Name: " + getShipName() + "\n" + "Maximum passengers: " + getMaxPassengers();
	}
	

}
