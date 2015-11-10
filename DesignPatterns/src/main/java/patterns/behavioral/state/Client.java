package patterns.behavioral.state;

/**
 * 
 * STATE
 * 
 * recognizeable by behavioral methods which changes its behaviour depending on
 * the instance's state which can be controlled externally
 * 
 * - ����ң���������״̬�ǿ�����ִ�д򿪵��Ӳ��������״̬�ǹرգ���ִ�йرյ��Ӳ���
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Person person = new Person(new HappyState());
		System.out.println("Hello in happy state: " + person.sayHello());
		System.out.println("Goodbye in happy state: " + person.sayGoodbye());

		person.setEmotionalState(new SadState());
		System.out.println("Hello in sad state: " + person.sayHello());
		System.out.println("Goodbye in sad state: " + person.sayGoodbye());

	}

}
