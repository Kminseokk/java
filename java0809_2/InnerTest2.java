package java0809_2;

public class InnerTest2 {
	public static void main(String[] args){
		//�ܺ� Ŭ���� �������� �ʰ� �ٷ� ���� ���� Ŭ���� ����
		OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass(); 
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��");
		OutClass2.InStaticClass.sTest(); 
		}
}
