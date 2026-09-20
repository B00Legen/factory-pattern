abstract class Logistics {
	public abstract Transport createTransport();
	public void planDelivery(String cargo, String destination) {
		Transport t = createTransport();
		t.deliver(cargo, destination);
	}
}
