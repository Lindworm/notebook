package patterns.behavioral.command;

/**
 * 
 * COMMAND
 * 
 * in an abstract/interface type which invokes a method in an implementation of a different abstract/interface type
 * which has been encapsulated by the command implementation during its creation
 * 
 * - Commandģʽ������ĵ�����������߽���
 * - �����߳�����������ã������������н����ߵ�����
 * 
 * Invoker
 * Receiver
 * Command
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Command c = new LunchCommand(new LunchReceiver());
		Invoker i = new Invoker(c);
		i.invoke();
	}

}
