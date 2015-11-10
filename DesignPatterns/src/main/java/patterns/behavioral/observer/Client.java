package patterns.behavioral.observer;

/**
 * 
 * OBSERVER
 * 
 * invokes a method on an instance of another abstract/interface type, depending on own state
 * 
 * - �������֮���һ�Զ��������ϵ����һ�������״̬�����ı�ʱ�������������Ķ��󶼵õ�֪ͨ���Զ�����
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.attach(new Observer1());
		subject.attach(new Observer2());
		subject.inform();
	}

}

class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("ob1 stop playing");
	}
	
}

class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("ob2 stop playing");
	}
	
}

