package java0809_2;

public class OutClass {
	private int num = 10; //�ܺ�Ŭ���� private ����
	private static int sNum = 20; //�ܺ�Ŭ���� ��������
	InClass inClass; //����Ŭ���� �ڷ��� ���� ���� ����
	public OutClass(){
		inClass = new InClass(); //�ܺ�Ŭ���� ������. 
	}
	
	class InClass{ //�ν��Ͻ� ���� Ŭ����
		int inNum = 100; //����Ŭ������ �ν��Ͻ� ����
//		static int sInNum = 200; //�ν��Ͻ�����Ŭ������ �������� ���� �Ұ�
		void inTest(){
			System.out.println("OutClass num = " +num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
		}
	}
}

