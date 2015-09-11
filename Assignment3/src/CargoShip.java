
public class CargoShip extends Ship{
	
	private int maxCargo;
	
	
	public CargoShip(){
		maxCargo = 0;
	}
	
	public CargoShip(String shipName, int maxCargo){
		this.setShipName(shipName);
		this.setMaxCargo(maxCargo);
	}
	
	public int getMaxCargo() {
		return maxCargo;
	}

	public void setMaxCargo(int maxCargo) {
		this.maxCargo = maxCargo;
	}

	public String toString() {
		return "Name: " + getShipName() + "\n" + "Cargo capacity: " + getMaxCargo() + " tons";
	}
	
	
}
