package java0809_2;

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(10); //�޼ҵ� ȣ��
		runner.run(); 
		out.runner.run();
		}
}
