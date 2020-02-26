package javajungsuk2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberEx2 {
	
	public static void prnMember(MemberVO memberVO) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년mm월dd일");
		
		System.out.println("이름 : " + memberVO.getCustname() + "(" + memberVO.getCustno() + ")" );
		System.out.println("등급 :" + memberVO.getGrade() + "\n" + "거주도시:" + memberVO.getCity());
		System.out.println("전화번호 : " + memberVO.getPhone() + "가입일자 : " + sf.format(memberVO.getJoindate()));
		System.out.println("주소 : " + memberVO.getAddress());
		
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
		
		MemberVO member = new MemberVO(); //하나의 member의 인적사항들을 담고있는 memberVO로 객체를 생성한다
		member.setCustno(100001);
		member.setCustname("김행복");
		member.setPhone("010-1111-2222");
		member.setAddress("서울 동대문구 휘경1동");
		member.setJoindate(new Date(115, 11, 2));
		member.setGrade('A');
		member.setCity("01");
		
		MemberVO member2 = new MemberVO();
		member2.setCustno(100002);
		member2.setCustname("이축복");
		member2.setPhone("010-1111-3333");
		member2.setAddress("서울 동대문구 휘경2동");
		member2.setJoindate(new Date(119, 11, 6));
		member2.setGrade('B');
		member2.setCity("01");
		
		memberlist.add(member); //member를 리스트에 넣는다
		memberlist.add(member2); //member2를 리스트에 넣는다
		//ArrayList의 경우에서 보면 SIZE는 2이다

		prnMemberAll(memberlist);
	}

}
