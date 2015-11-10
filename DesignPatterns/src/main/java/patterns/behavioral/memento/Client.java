package patterns.behavioral.memento;

/**
 * 
 * MEMONTO ����¼ģʽ
 * 
 * - internally changes the state of the whole instance
 * 
 * �ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬��
 * �����Ժ�Ϳɽ��ö���ָ���ԭ�ȱ����״̬��
 * 
 * ����¼����洢ԭ����(originator)������ĳ��˲����ڲ�״̬��
 * ����Ҫ����ԭ�����ļ���ʱ��ȡ���������ƻ���ԭ��������һ������¼��ԭ������������ǰ״̬����Ϣ��ʼ��
 * �ñ���¼��ֻ��ԭ������������¼�д�ȡ��Ϣ������¼���������󲻿ɼ�
 * 
 * - Memento������Ҫ���洢�Ķ���״̬
 * - Originator�������洢����״̬��Memento
 * - Caretaker�����Memento�лָ�����״̬
 * 
 * - ���ݿ�����ع�����
 * - ���ģʽ
 *   ����ģʽ
 * 
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Caretaker ct = new Caretaker();
		Originator ori = new Originator();
		ori.set("state1");
		ct.addMemento(ori.saveToMemento());
		ori.set("state2");
		ct.addMemento(ori.saveToMemento());
		ori.set("state3");
		ct.addMemento(ori.saveToMemento());
		ori.restoreFromMemento(ct.getMemento(0));
		System.out.println(ori);
	}

}
