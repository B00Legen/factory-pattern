import Logistics.Logistics;
import Logistics.RoadLogistics;
import Logistics.SeaLogistics;

public class Main {
	
	public static void main (String[] args) {
		GUIFactory factory;
		Logistics logistics;
		
		DeliveryApplication app = new DeliveryApplication(factory, logistics);
	}
}

