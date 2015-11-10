package patterns.creational.singleton;

import java.util.concurrent.TimeUnit;

public class Singleton {
	private static volatile Singleton me;
	
	public static Singleton getInstance() {
		synchronized(Singleton.class) {
			if (me == null) {
				me = new Singleton();
			}
		}
		return me;
	}
	
	public Singleton() {
		try {
			// ģ�⸴�Ӷ��󴴽�
			TimeUnit.NANOSECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
