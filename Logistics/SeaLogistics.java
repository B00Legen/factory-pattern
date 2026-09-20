package Logistics;

import Transport.Transport;
import Transport.Ship;

public class SeaLogistics extends Logistics {
	public Transport createTransport() {
		return new Ship();
	}
}
