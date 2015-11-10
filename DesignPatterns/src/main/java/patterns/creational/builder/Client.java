package patterns.creational.builder;

/**
 * 
 * Builder
 * 
 * returning the instance itself
 * 
 * ���ƿͻ�Client�ý������ʦDirctorΪ�Լ���Ʒ��ӣ��ͻ�ͨ�����ʦ����������Ҫ��Щ���֣�
 * �������ʦ���ͻ�ȷ�ϵ����ͼֽ������ƹ��˽���ʩ�����ͻ��������˻�ȡ����
 * - Builder�����ṩ����������ֻ��һ�������Ʒ�ĳ���ӿڣ������˲�Ʒ���ڲ��ṹ��װ����̣�
 * ������޸Ĳ�Ʒ�ṹ��ʱ��ֻ��Ҫ����һ���µ�Builder����
 * - Builder������Director�������Ŀ�������ȷ����Ʒ�Ĳ��֣�������Ʒ���ʱDirector�Ŵ�
 * Builder������ȡ�������Ĳ�Ʒ���ܹ�����ϸ�Ŀ��ƹ�������
 * 
 */
public class Client {

	public static void main(String[] args) {
		// �ͻ�����Director���󣬲���������Ҫ��Builder�����������
		Director director = new Director(new ConcreteBuilder());
		Product product = director.getBuilder().getResult();
		System.out.println(product.toString());
	}

}
