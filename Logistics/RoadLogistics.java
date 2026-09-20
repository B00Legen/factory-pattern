package Logistics;

import Transport.Transport;
import Transport.Truck;

public class RoadLogistics extends Logistics {
	public Transport createTransport() {
		return new Truck();
	}
}
