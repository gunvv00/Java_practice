package javajungsuk2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberEx2 {
	
	public static void prnMember(MemberVO memberVO) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy��mm��dd��");
		
		System.out.println("�̸� : " + memberVO.getCustname() + "(" + memberVO.getCustno() + ")" );
		System.out.println("��� :" + memberVO.getGrade() + "\n" + "���ֵ���:" + memberVO.getCity());
		System.out.println("��ȭ��ȣ : " + memberVO.getPhone() + "�������� : " + sf.format(memberVO.getJoindate()));
		System.out.println("�ּ� : " + memberVO.getAddress());
		
	}
	public static void prnMemberAll(List<MemberVO> memberList) {
		for(int i = 0; i < memberList.size(); i++ ) {
			MemberVO member = memberList.get(i);
			prnMember(member);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		List<MemberVO> memberlist = new ArrayList<MemberVO>();
		
		MemberVO member = new MemberVO(); //�ϳ��� member�� �������׵��� ����ִ� memberVO�� ��ü�� �����Ѵ�
		member.setCustno(100001);
		member.setCustname("���ູ");
		member.setPhone("010-1111-2222");
		member.setAddress("���� ���빮�� �ְ�1��");
		member.setJoindate(new Date(115, 11, 2));
		member.setGrade('A');
		member.setCity("01");
		
		MemberVO member2 = new MemberVO();
		member2.setCustno(100002);
		member2.setCustname("���ູ");
		member2.setPhone("010-1111-3333");
		member2.setAddress("���� ���빮�� �ְ�2��");
		member2.setJoindate(new Date(119, 11, 6));
		member2.setGrade('B');
		member2.setCity("01");
		
		memberlist.add(member); //member�� ����Ʈ�� �ִ´�
		memberlist.add(member2); //member2�� ����Ʈ�� �ִ´�
		//ArrayList�� ��쿡�� ���� SIZE�� 2�̴�

		prnMemberAll(memberlist);
	}

}