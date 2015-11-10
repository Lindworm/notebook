package patterns.behavioral.templatemethod;

/**
 * 
 * TEMPLATE METHOD
 * 
 * recognizeable by behavioral methods which already have a "default" behaviour definied by an abstract type
 * 
 * - ����һ�������е��㷨�ĹǼܣ�����һЩ�����ӳٵ�������
 * - ��������ڲ��ı��㷨�Ľṹ����������¶�����㷨���ض�����
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Cooker c1 = new FishCooker();
		c1.cook();
		Cooker c2 = new ChickenCooker();
		c2.cook();
	}
	
}


