package patterns.creational.abstractFactory;

import javax.xml.parsers.ParserConfigurationException;

/**
 * 
 * Abstract Factory
 * 
 * returning the factory itself which in turn can be used to create another abstract/interface type
 * 
 * �������������������о���ʵ�����Ǹ���
 * ���󹤳����Լ�����ʵ�����ĸ���
 * 
 * ����һ����ص����ͣ����紴�����⣬��������Button��Label���ɵ�
 * ��˴���ǳɫ��������ɫ����Ĺ�������������Button��Label�ķ���
 * 
 * @author LSK
 *
 */
public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParserConfigurationException {
		// ���󹤳���Ҫ���ؾ������ɫ���⹤�������������ֻ��һ������
		AbstractThemeFactory fac = AbstractThemeFactory.newInstance("dark");
		Button btn = fac.newButton();
		Panel pnl = fac.newPanel();
	}

}
