package java0809;

public class Student {
	String memberId; //ȸ�� ���̵�
	private String memberName; //ȸ�� �̸�
	int memberIdint;
	
	public Student(String memberId, String memberName){ //������
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
	return memberIdint;
	}
	
	public void setMemberId(String memberId) {
	this.memberId = memberId;
	}
	
	public String getMemberName() {
	return memberName;
	}
	
	public void setMemberName(String memberName) {
	this.memberName = memberName;
	}
	
	public boolean equals(Object obj) {
		if( obj instanceof Student){
		Student member = (Student)obj;
		if( this.memberId == member.memberId ) {
			System.out.println(member.memberId+" �� �ߺ��Ǿ� �ֽ��ϴ�. �ݿ����� �ʽ��ϴ�.");
			return true;	
		}

		else 
			return false;
		}
		return false;
	}

	public int hashCode() {
		int memberIdint = Integer.parseInt(memberId);
		return memberIdint;
	}

	
	@Override
	public String toString(){ //toString �޼ҵ� �������̵�
		return memberId + " : " + memberName;
	}
}
