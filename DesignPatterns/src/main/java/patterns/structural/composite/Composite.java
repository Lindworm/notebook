package patterns.structural.composite;

import java.util.ArrayList;

public class Composite extends Component {
	
	private String id;
	
	public Composite(String id) {
		this.id = id;
	}

	// �洢�ӽڵ㣬���ݽṹ�����б��������顢ӳ��
	private ArrayList<Component> components = new ArrayList<Component>();

	@Override
	public void show() {
		System.out.println(this.id);
		for (Component son : this.components) {
			son.show();
		}
	}

	@Override
	public void addComponent(Component component) {
		components.add(component);
	}

	@Override
	public ArrayList<Component> getComponents() {
		return this.components;
	}
	
	

}
