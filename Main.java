import Logistics.Logistics;
import Logistics.RoadLogistics;
import Logistics.SeaLogistics;

import Factory.GUIFactory;
import Factory.WindowsFactory;
import Factory.MacOSFactory;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		GUIFactory factory = null;
		Logistics logistics = null;
		
		System.out.println("Delivery mode: ");
		String delivery = scanner.nextLine();
		
		System.out.println("UI platform: ");
		String platform = scanner.nextLine();
		
		if (delivery.equalsIgnoreCase("ROAD")) logistics = new RoadLogistics();
		else if (delivery.equalsIgnoreCase("SEA")) logistics = new SeaLogistics();
		
		if (platform.equalsIgnoreCase("WINDOWS")) factory = new WindowsFactory();
		else if (platform.equalsIgnoreCase("MACOS")) factory = new MacOSFactory();
		
		DeliveryApplication app = new DeliveryApplication(factory, logistics);
		app.run();
	}
}

