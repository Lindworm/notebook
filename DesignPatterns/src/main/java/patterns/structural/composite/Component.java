package patterns.structural.composite;

import java.util.ArrayList;

public abstract class Component {
	
	public abstract void show();

	public void addComponent(Component component) {
		// ȱʡ����
		throw new RuntimeException("not support yet");
	}

	public ArrayList<Component> getComponents() {
		// ȱʡ����
		throw new RuntimeException("not support yet");
	}

}
