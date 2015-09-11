
public class DemoShip {

	public static void main(String[] args) {
		
		Ship[] shipArry = new Ship[3];
		
		shipArry[0] = new Ship("Gerald R. Ford", "2013");
		shipArry[1] = new CruiseShip("Titanic", 2435);
		shipArry[2] = new CargoShip("Sea Star", 115000);
		
		for(int i = 0; i < shipArry.length; i++){
			System.out.println(shipArry[i].toString() + "\n" + "----------------------------");
		}

	}

}
