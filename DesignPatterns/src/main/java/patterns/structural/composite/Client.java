package patterns.structural.composite;

/**
 * 
 * COMPOSITE
 * 
 * taking an instance of same abstract/interface type into a tree structure
 *
 * - ��ͼ
 * ������������νṹ�Ա�ʾ������-���֡��Ĳ�νṹ��Compositeʹ���û��Ե����������϶����ʹ�þ���һ����
 * 
 * - ���ģ��������������νṹ��γ����֧�ڵ��Ҷ�ӽڵ�ķ���
 * Compositeģʽ�ĺ�����һ�������࣬���ȿ��Դ���ͼԪ���ֿ��Դ���ͼԪ����������ͼ��ϵͳ�е���������Graphic��
 * ��ͼ��ϵͳ�е���������Graphic��������һЩ���ض�ͼ�ζ�����صĲ�������Draw��ͬʱ����Ҳ���������е���϶������
 * һЩ����������һЩ�������ڷ��ʺ͹��������Ӳ���
 * 
 * - Component ��֧��Ҷ�ӽڵ�ĳ�����
 * - Ϊ�������з�֧\Ҷ�ӽڵ���������ӿ�
 * - ���ʵ�������£�ʵ�����з�֧\Ҷ�ӽڵ� �๲�нӿ�
 * - ����һ���ӿ����ڷ��ʺ͹���Ҷ�ӽڵ�
 * - ����һ���ӿ����ڷ����丸�ڵ�
 * 
 * - Composite ��֧�ڵ�
 * - ����Ҷ�ӽڵ����Ϊ
 * - �洢Ҷ�ӽڵ������
 * - ʵ���Ӳ����йصĲ���
 * 
 * - Leaf Ҷ�ӽڵ�
 * - ������б�ʶҶ�ӽڵ����Ҷ�ӽڵ�û���ӽڵ�
 * - ������ж���ͼԪ�������Ϊ
 * 
 * - Э��
 * �û�ʹ��Component��ӿ�����Ͻṹ�еĶ�����н�����
 * �����������һ��Ҷ�ӽڵ㣬��ֱ�Ӵ�������
 * �����������һ����֧�ڵ㣬��ͨ���������͸������ӽڵ�
 * 
 * - ���ģʽ
 * - Responsibility of Chain ���ڷ�֧�ڵ��Ҷ�ӽڵ������
 * - Decorator װ����ģʽ�����ģʽʹ�ù����ĸ��࣬װ���ű���֧��������صĽӿ�
 * - Flyweight ���㹲����������������������ǵĸ�����
 * - Itertor ����������Composite��֧�ڵ�
 * - Visitor ���ֲ��ڷ�֧�ڵ��Ҷ�ӽڵ��еĲ�������Ϊ�ֲ���
 * 
 * @author LSK
 * 
 */
public class Client {
	public static void main(String[] args) {
		Composite root = new Composite("root");
		Leaf leaf0 = new Leaf("leaf0");	
		root.addComponent(leaf0);
		Composite branch = new Composite("branch");
		Leaf leaf1 = new Leaf("leaf1");
		Leaf leaf2 = new Leaf("leaf2");
		root.addComponent(branch);
		branch.addComponent(leaf1);
		branch.addComponent(leaf2);
		root.show();
	}
}
