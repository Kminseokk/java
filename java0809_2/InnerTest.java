package java0809_2;

public class InnerTest {
	public static void main(String[] args){
		OutClass outClass = new OutClass(); //�ܺ�Ŭ���� �ν��Ͻ� ����
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.inClass.inTest();
		}
}
