public class Ship {
	
	private String shipName;
	private String shipYear;
	
	
	public Ship(){
		shipName = "UNKNOWN";
		shipYear = "UNKNOWN";
	}
	
	public Ship(String shipName, String shipYear){
		this.setShipName(shipName);
		this.setShipYear(shipYear);
	}
	
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getShipYear() {
		return shipYear;
	}
	public void setShipYear(String shipYear) {
		this.shipYear = shipYear;
	}
	
	
	public String toString() {
		return "Name: " + getShipName() + "\n" + "Year built: " + getShipYear();
	}
	

}
