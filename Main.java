public class Main {
	
	public static void main (String[] args) {
		Logistics road = new RoadLogistics();
		road.planDelivery("Books", "Almaty");
		
		Logistics sea = new SeaLogistics();
		sea.planDelivery("Cars", "Aktau");
	}
}

