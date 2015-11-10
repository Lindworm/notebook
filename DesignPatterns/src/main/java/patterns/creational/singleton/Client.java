package patterns.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * SINGLETON
 * 
 * returning the same instance (usually of itself) everytime
 * 
 * 1.����ö��Ԫ�صĵ�������
 * 2.�ӳٳ�ʼ��ռλ��ģʽ
 * 3.ʹ��������
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		for (int i=0; i<100; i++) {
			executor.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(ResourceFactory.getResource());
					System.out.println(SingletonEnum.INSTANCE.getProperty());
					System.out.println(Singleton.getInstance());
				}
			});
		}
		executor.shutdown();
	}
	
}
