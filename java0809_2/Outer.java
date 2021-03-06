package java0809_2;

public class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i){
		int num = 100; //지역변수
		class MyRunnable implements Runnable{ //지역내부클래스
			int localNum = 10; //지역내부클래스의 인스턴스변수
			@Override
			public void run() {
				System.out.println("i =" + i); 
				System.out.println("num = " +num); 
				System.out.println("localNum = " +localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
			}
		}
		return new MyRunnable();
	}

}
