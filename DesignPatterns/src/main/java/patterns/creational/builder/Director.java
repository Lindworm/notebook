package patterns.creational.builder;

/*
 * ������:���ƽ������ʦ
 */
public class Director {
	
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
		this.builder.buildPartA();
		this.builder.buildPartB();
		this.builder.buildPartC();
	}

	public Builder getBuilder() {
		return this.builder;
	}
}
