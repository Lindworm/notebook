package patterns.creational.builder;

public interface Builder {
	public void buildPartA();
	public void buildPartB();
	public void buildPartC();
	
	public Product getResult();
}
