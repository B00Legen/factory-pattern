package Transport;

public class Truck implements Transport {
	public void deliver(String cargo, String destination) {
		System.out.println("Delivering " + cargo + " to " + destination + " by land");
	}
}
