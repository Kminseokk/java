package java0809_2;

public class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i){
		int num = 100; //��������
		class MyRunnable implements Runnable{ //��������Ŭ����
			int localNum = 10; //��������Ŭ������ �ν��Ͻ�����
			@Override
			public void run() {
				System.out.println("i =" + i); 
				System.out.println("num = " +num); 
				System.out.println("localNum = " +localNum);
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(�ܺ� Ŭ���� ���� ����)");
			}
		}
		return new MyRunnable();
	}

}