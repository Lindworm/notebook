package patterns.behavioral.chainofresponsibility;
/**
 * 
 * CHAIN OF RESPONSIBILITY
 * 
 * recognizeable by behavioral methods which (indirectly) invokes the same method in another implementation of same abstract/interface type in a queue
 * 
 * - ͬһ���ӿڵĶ��ʵ���๹��һ�������������еĲ�ͬ�����������д���
 * - �����������Ĵ�����������������Ĵ����������
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		// Instance Handler
		PlanetHandler mercuryHandler = new MercuryHandler();
		PlanetHandler venusHandler = new VenusHandler();
		PlanetHandler earthHandler = new EarthHandler();
		
		// Construct Handler Chain
		mercuryHandler.setSuccessor(venusHandler);
		venusHandler.setSuccessor(earthHandler);
		PlanetHandler chain = mercuryHandler;
		
		// Handler Request
		chain.handleRequest(PlanetRequest.EARTH);
	}

}

class EarthHandler extends PlanetHandler {
	@Override
	public void handleRequest(PlanetRequest request) {
		if (request == PlanetRequest.EARTH) {
			System.out.println("EarthHandler handles " + request);
		} else {
			System.out.println("EarthHandler doesn't handle " + request);
			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}
}

class VenusHandler extends PlanetHandler {
	@Override
	public void handleRequest(PlanetRequest request) {
		if (request == PlanetRequest.VENUS) {
			System.out.println("VenusHandler handles " + request);
		} else {
			System.out.println("VenusHandler doesn't handle " + request);
			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}
}

class MercuryHandler extends PlanetHandler {
	@Override
	public void handleRequest(PlanetRequest request) {
		if (PlanetRequest.MERCURY == request) {
			System.out.println("MercuryHandler handles " + request);
		} else {
			System.out.println("MercuryHandler doesn't handle " + request);
			if (this.successor != null) {
				this.successor.handleRequest(request);
			}
		}
	}
}
