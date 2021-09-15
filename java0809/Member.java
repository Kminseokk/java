package java0809;

public class Member {
	int memberId; //ȸ�� ���̵�
	private String memberName; //ȸ�� �̸�
	
	public Member(int memberId, String memberName){ //������
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
	return memberId;
	}
	
	public void setMemberId(int memberId) {
	this.memberId = memberId;
	}
	
	public String getMemberName() {
	return memberName;
	}
	
	public void setMemberName(String memberName) {
	this.memberName = memberName;
	}
	
	public boolean equals(Object obj) {
		if( obj instanceof Member){
		Member member = (Member)obj;
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
		return memberId;
	}

	
	@Override
	public String toString(){ //toString �޼ҵ� �������̵�
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�";
	}
}
