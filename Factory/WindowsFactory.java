package Factory;

import UI.Button;
import UI.Checkbox;
import UI.WindowsButton;
import UI.WindowsCheckbox;


public class WindowsFactory implements GUIFactory {
	public Button createButton() {
		return new WindowsButton();
	}
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
