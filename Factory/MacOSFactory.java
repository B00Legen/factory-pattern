package Factory;

import UI.Button;
import UI.Checkbox;
import UI.MacOSButton;
import UI.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
	public Button createButton() {
		return new MacOSButton();
	}
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}
