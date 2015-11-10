package patterns.creational.prototype;

import java.util.concurrent.TimeUnit;

/**
 * PROTOTYPE
 * 
 * returning a different instance of itself with the same properties
 * 
 * Prototype����һ����ͬ��ԭʼ����Ŀ�¡�����¶�����ԭ���������ͬ��״̬���ԣ�
 * �¶��󴴽�֮����ܷ���״̬���Եı仯�����Կ����ȸ���ԭ�͵õ���¡��������޸Ŀ�¡���������
 * 
 * @Ӧ�ó���
 * 1����ѭ�����д�������ʱ��ʹ��ԭ��ģʽ��ʹ�ù��캯����������Ч�ʸ���
 * 2���������Ķ��ʵ������С��ʱ����ȥÿ���ֹ���ʼ�����ر��Ч
 * 3������������ʱ����̬�����
 * 
 * @Benefits
 * - ��¡�������ܱȴ����¶������ܸ��ߣ�ע�����������
 * - ԭ�Ͷ�������ڳ��������е��κ�ʱ�̱�����
 * 
 * @Comparison
 * - ������������ע�ڴ����µĲ��Ҹ�����ͬ����ʵ��
 * - ԭ�ͣ���ע�ڴ������״̬���Բ�𲻴�Ķ���ʵ��
 * - ���󹤳�����ע�ڴ���һ���໥�����Ķ���ʵ��
 * - �����ߣ���ע�ڴ�������ʵ�����̵Ŀ�����
 * 
 * @author Kay
 * 
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		long start = System.currentTimeMillis();
		Prototype p = new Prototype(0);
		for (int i=0; i<1000; i++) {
			Prototype tmp = (Prototype)p.clone();
			tmp.setId(i);
			//Prototype tmp = new Prototype(i);
		}
		long end = System.currentTimeMillis();
		System.out.printf("Time Cost: %sms", end -start);
	}
	
}

class Prototype implements Cloneable {
	private int id;

	public Prototype(int id) {
		this.id = id;
		try {
			TimeUnit.MILLISECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}


