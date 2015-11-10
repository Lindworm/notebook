package patterns.creational.factoryMethod;

/**
 * 
 * Factory Method
 * 
 * returning an implementation of an abstract/interface type
 * 
 * ���1��һ���ӿ��ж��ʵ���࣬ÿ��ʵ������һ�������൥�����𴴽������е���Щ�����඼ʵ����ͬһ�������ӿ�
 * ���2��������������ָһ���������÷�������һ���������ʵ��������ֻ��ͨ�����෽����д���ı䷵��ֵ
 * 
 * 
 * 1.���������ṩ������ʵ���Ľӿ�
 * 2.������ʼ����һ����Ŀ���
 * 
 * - Collection interface iterator()
 * 
 * @author LSK
 *
 */

public class Client {
	public static void main(String[] args) {
		LoggerFactory c = new ConsoleLoggerFactory();
		// getLogger()�����ǹ�������
		Logger logger = c.getLogger();
		logger.info("hello");
	}
}
