package patterns.behavioral.mediator;

public interface Colleague {
	// �ɻ�����̨������Ϣ
	public void send(String message);
	// �ɻ�������̨����Ϣ
	public void receive(String message);
}
