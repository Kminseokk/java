package java0809_2;

public class OutClass2 {
	private int num = 10;
	private static int sNum = 20; 
	static class InStaticClass { //�������� Ŭ����
		int inNum = 100; //��������Ŭ������ �ν��Ͻ�����
		static int sInNum = 200; //��������Ŭ������ ��������
		void inTest(){ //��������Ŭ������ �Ϲ� �޼���
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ����s ���)"); 
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
		}
		static void sTest(){ // ��������Ŭ������ static �޼���
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���)");
		}
	}

}
