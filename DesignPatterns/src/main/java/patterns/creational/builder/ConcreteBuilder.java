package patterns.creational.builder;

/*
 * �����ߣ����ƽ�������
 * - ʵ��Builder�Ľӿ��Թ����װ��ò�Ʒ�ĸ�������
 * - ���岢��ȷ���������ı�ʾ
 * - �ṩһ��������Ʒ�Ľӿڣ���getResult����Product
 */
public class ConcreteBuilder implements Builder {

	private PartA parta;
	private PartB partb;
	private PartC partc;

	@Override
	public void buildPartA() {
		this.parta = new PartA();
	}

	@Override
	public void buildPartB() {
		this.partb = new PartB();
	}

	@Override
	public void buildPartC() {
		this.partc = new PartC();
	}

	@Override
	public Product getResult() {
		Product p = new Product();
		p.setParta(parta);
		p.setPartb(partb);
		p.setPartc(partc);
		return p;
	}

}
