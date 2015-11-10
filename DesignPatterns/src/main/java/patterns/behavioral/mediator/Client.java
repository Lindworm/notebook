package patterns.behavioral.mediator;

/**
 * Mediator
 * 
 * taking an instance of different abstract/interface type (usually using the command pattern) which delegates/uses the given instance
 * 
 * - �ڲ�ͬ����֮����Ϊһ�����õ�ͨѶý��
 * - ����������֮��ֱ�ӽ��������µ����
 * - �������ź�����Ϊ���зɻ����ͨѶý��
 * - ��һ���н��������װһϵ�еĶ��󽻻����н���ʹ��������Ҫ��ʽ���໥���ã��Ӷ�ʹ�������ɢ�����ҿ��Զ����ظı�����֮��Ľ���
 * - �н���ģʽ�ǽ��ɻ�֮��ֱ��ͨѶ��ְ��ת��ͨ����̨��ʵ�ַɻ�֮���ͨѶ
 * - �۲���ģʽ�����зɻ�������̨��״̬�仯 
 * 
 * @author LSK
 *
 */
public class Client {
	
	public static void main(String[] args) {
		
		Mediator mediator = new Mediator();
		
		Colleague c1 = new ConcreteColleague1(mediator);
		Colleague c2 = new ConcreteColleague2(mediator);
		
		mediator.addColleague(c1);
		mediator.addColleague(c2);
		
		
		c1.send("C1 Send Message");
		c2.send("C2 Send Message");
	}
}

