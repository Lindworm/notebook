package patterns.behavioral.iterator;

/**
 * 
 * ITERATOR
 * 
 * sequentially returning instances of a different type from a queue
 * 
 * - �����б�ı������б�����з������������һ��������������
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Container<String> c = new ConcreteContainer();
		Iterator<String> iterator = c.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
