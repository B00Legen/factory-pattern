package Factory;

import UI.Button;
import UI.Checkbox;

public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
}
