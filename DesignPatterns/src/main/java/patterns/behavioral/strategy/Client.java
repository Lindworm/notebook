package patterns.behavioral.strategy;
/**
 * STRATEGY ����ģʽ
 * 
 * recognizeable by behavioral methods in an abstract/interface type which invokes a method in an implementation of 
 * a different abstract/interface type which has been passed-in as method argument into the strategy implementation
 * 
 * - ���ض������ж��ִ����㷨ʱ��ϣ��������ʱ�ɵ����߾�������ʹ�ú����㷨
 * 
 * -- ģʽ��ϵ --
 * Strategy vs State 
 * ����ģʽContext���󲻳���Strategy�ӿ�ʵ�������ã�����ͨ��������������ʽ����Strategy
 * ״̬ģʽContext�������һ��State�ӿ�ʵ��������
 *    
 * @author LSK
 *
 */
public class Client {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.pay(new CreditCardStrategy());
		cart.pay(new PaypalStrategy());
	}
}

class ShoppingCart {
	
	public void pay(PaymentStrategy strategy) {
		strategy.pay();
	}
	
}

class CreditCardStrategy implements PaymentStrategy {

	@Override
	public void pay() {
		System.out.println(" paid using credit card ");
	}

}

class PaypalStrategy implements PaymentStrategy {

	@Override
	public void pay() {
		System.out.println(" paid using Paypal.");
	}

}
