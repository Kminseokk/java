package java0809_2;

public class Outer2 {
	Runnable getRunnable(int i){
		int num = 100;
		return new Runnable() { //�͸� ���� Ŭ����. Runnable �������̽� ����
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
				}
			};
		}
		Runnable runner = new Runnable() { //�͸� ���� Ŭ������ ������ ����
		@Override
		public void run() {
			System.out.println("Runnable �� ������ �͸� Ŭ���� ����");
		}
	};
}
