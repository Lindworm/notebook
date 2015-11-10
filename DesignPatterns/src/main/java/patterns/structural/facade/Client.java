package patterns.structural.facade;

/**
 * 
 * FACADE
 * 
 * internally uses instances of different independent abstract/interface types
 * 
 * ��ͼ��Ϊ��ϵͳ�е�һ��ӿ��ṩһ��һ�µĽ��棬Facade������һ���߲�ӿڣ�����ӿ�ʹ����һ��ϵͳ��������ʹ�á�
 * classes Э�����ͻ�����ͨ�����������Facade�ķ�ʽ����ϵͳͨѶ��Facade����Щ��Ϣת�����ʵ�����ϵͳ����
 * ��������ϵͳ�е��йض�������ʵ�ʹ�������Facadeģʽ����Ҳ���뽫���Ľӿ�ת������ϵͳ�Ľӿ�
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Facade f = new Facade();
		f.operation();
	}
}
