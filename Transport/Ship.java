package Transport;

public class Ship implements Transport {
	public void deliver(String cargo, String destination) {
		System.out.println("Delivering " + cargo + " to " + destination + " by sea");
	}
}
