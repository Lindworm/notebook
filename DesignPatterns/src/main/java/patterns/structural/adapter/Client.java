package patterns.structural.adapter;

/**
 * 
 * Adapter
 * 
 * taking an instance of different abstract/interface type and returning an implementation of 
 * own/another abstract/interface type which decorates/overrides the given instance
 * 
 * ��һ����Ľӿ�ת���ɿͻ�ϣ��������һ���ӿڡ�Adapterģʽʹ��ԭ�����ڽӿڲ����ݶ�����һ��������Щ�����һ����
 * 
 * ҵ��ϸ�ڽӿ���Ҫ����ҵ���޹صĹ�����ӿڣ���ȷ�����޸�ԭ�ӿ�ʵ�ֵĻ����ϣ�ͨ�������������ౣ֤����Эͬ������
 * 
 * Ϊ���ö���ƵĹ������಻�ܹ����õ�ԭ���������Ϊ���Ľӿ���רҵӦ����������Ҫ�Ľӿڲ�ƥ
 * 
 * #������
 * ����ʹ��һ���Ѿ����ڵ��࣬�����Ľӿڲ��������Ҫ��
 * ���봴��һ�����Ը��õ��࣬�����������������ص���򲻿�Ԥ������Эͬ����
 * ����ʹ��һЩ�Ѿ����ڵ����࣬���ǲ����ܶ�ÿһ�����������໯ƥ�����ǵĽӿڡ����������������������ĸ���ӿ�
 * 
 * ## ������
 * Target     	����Clientʹ�õ����ض�������صĽӿ�
 * Client		�����Target�ӿڵĶ���Эͬ
 * Adaptee		����һ���Ѿ����ڵĽӿڣ�����ӿ���Ҫ����
 * Adapter		��Adaptee�Ľӿ���target�ӿڽ�������
 * 
 * ## Ч��
 * ���������Ͷ����������в�ͬ��Ȩ��
 * ����������
 * - ��һ�������Adapter���Adaptee��Target����ƥ�䡣�����������Ҫƥ��һ���༰������������ʱ����Adapter������ʤ��
 * - ʹ��Adapter�������¶���Adaptee�Ĳ�����Ϊ����ΪAdapter��Adaptee��һ������
 * - ����������һ�����󣬲�����Ҫ�����ָ���ӵõ�adaptee
 * �������䣺
 * - ����һ��Adapter����Adaptee
 * - ʹ���ض���Adaptee����Ϊ�Ƚ�Ⱥ��
 * 
 * ��������ķ����޷�������Ҫʱ��������һ�������¶ȼƿ��Բ����¶ȣ���������֪�������¶ȣ�
 * ͨ�������¶ȼƵĽӿڣ��ڽӿ��м�����Ҫ�ķ������ڽӿڵ�ʵ�����г��������¶ȼƵ�����
 * 
 * �����෽�����صĽ����Ҫ��һ��ת�����ܹ�ϵͳ�е�������ʹ�ã�
 * ���һ���������ӿ�ģ��Ŀ������Ҫ�ķ������ڽӿڵ�ʵ�����У�
 * ͨ�������������ʵ�����ڽӿڷ�������һ����ת���õ���Ҫ�Ĺ���
 * 
 * java.io.InputStreamReader(InputStream) (returns a Reader)
 * java.io.OutputStreamWriter(OutputStream) (returns a Writer)
 * 
 * @author LSK
 */
public class Client {

	public static void main(String[] args) {
		ThermometerAdapter tr = new ThermometerAdapterImpl(new CelciusThermometer());
		tr.setCelsius(16);
		System.out.printf("Celcius: %3.1f, Fahrenheit: %3.1f\n", tr.getCelsius(), tr.getFahrenheit());
	}

}
