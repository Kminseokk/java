package java0809;
import java.util.HashSet;
//import java.util.Iterator;

public class StudentTest {
	public static void main(String[ ] args) {
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("100", "������"));
		set.add(new Student("200", "������"));
		set.add(new Student("300", "����Ź"));
		set.add(new Student("100", "���Ƹ�"));
		System.out.println(set);
	}
}
