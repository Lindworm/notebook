package patterns.structural.flyweight;

/**
 * 
 * FLYWEIGHT
 * 
 * recognizeable by creational methods returning a cached instance
 * 
 * - a bit like the "Multiton pattern" idea
 * 
 * - ִ��ʱ�����״̬�ض����ڲ��Ļ��ⲿ��
 * 
 * - internal state should be stored in the concrete flyweight
 * 
 * - external state should be passed by client
 * 
 * - Clientֻ�ܴ�FlyweightFactory����õ�ConcreteFlyweight
 * 
 * - ���ʹ��Flyweightʵ��State��Strategy����
 * 
 * @author LSK
 *
 */
public class Client {
	public static void main(String[] args) {
		Flyweight f1 = FlyweightFactory.getInstance().getFlyweight("adding");
		f1.cal(3, 4);
		Flyweight f2 = FlyweightFactory.getInstance().getFlyweight("multiplying");
		f2.cal(3, 4);
	}
}
