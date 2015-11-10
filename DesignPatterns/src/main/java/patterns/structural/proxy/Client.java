package patterns.structural.proxy;

/**
 * 
 * PROXY
 * 
 * returns an implementation of given abstract/interface type which in turn
 * delegates/uses a different implementation of given abstract/interface type
 * 
 * ����ģʽ��������ģʽ������
 * 	     ������Ϊ��������Ķ����ṩһ����ͬ�Ľӿ�
 *    �����ṩ��������ʵ����ͬ�Ľӿ�
 * ����ģʽ��װ����ģʽ������
 *    ʵ�ֲ������ƣ���װ����ģʽΪ������ӹ��ܣ�������ģʽ���ƶ���ķ���
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		image.display();

	}

}
