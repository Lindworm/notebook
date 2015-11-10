package patterns.creational.singleton;

/**
 * �ӳٳ�ʼ��ռλ��ģʽ,JVM���Ƴ�ResourceHolder�ĳ�ʼ������
 */
public class ResourceFactory {
	private static class ResourceHolder {
		public static Resource resource = new Resource();
	}

	public static Resource getResource() {
		return ResourceHolder.resource;
	}
}

class Resource {
	// Singleton
}
