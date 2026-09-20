import Logistics.Logistics;
import Factory.GUIFactory;

import UI.Button;
import UI.Checkbox;

public class DeliveryApplication {
    private GUIFactory factory;
    private Logistics logistics;

    public DeliveryApplication(GUIFactory factory, Logistics logistics) {
        this.factory = factory;
        this.logistics = logistics;
    }
    
    public void run() {
		Button button = factory.createButton();
		Checkbox checkbox = factory.createCheckbox();

		button.paint();
		checkbox.paint();

		logistics.planDelivery("Books", "Almaty");
	}
}
