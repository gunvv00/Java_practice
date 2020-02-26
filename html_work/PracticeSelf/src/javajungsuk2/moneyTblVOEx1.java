package javajungsuk2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class moneyTblVOEx1 {
	
	public static void prnMember(moneyTblVO moneyTblVO) {
	SimpleDateFormat sf = new SimpleDateFormat("yyyy년mm월dd일");
	System.out.println("회원번호 : " + moneyTblVO.getCustno() + "(" + moneyTblVO.getSalenol() + ")" );
	System.out.println("단가 :" + moneyTblVO.getPcost() + "\n" + "수량:" + moneyTblVO.getAmount());
	System.out.println("가격 : " + moneyTblVO.getPrice() + "판매일자 : " + sf.format(moneyTblVO.getSdate()));
	System.out.println("상품코드 : " + moneyTblVO.getPcode());
	}
	
	public static void print(List<moneyTblVO> moneyTblVO ) {
		for(int i = 0 ; i < moneyTblVO.size(); i ++) {
			moneyTblVO moneyTblVO = new moneyTblVO.)
		}
		
	}

	public static void main(String[] args) {
		List<moneyTblVO> moneyTblVO = new ArrayList<moneyTblVO>();
		moneyTblVO.add(new moneyTblVO(100001, 20160001, 500, 5, 2500, "A001", new Date(116, 01, 01)));
		moneyTblVO.add(new moneyTblVO(100001, 20160002, 1000,4, 4000, "A002", new Date(116, 01, 01)));
		moneyTblVO.add(new moneyTblVO(100001, 20160003, 500, 3, 1500, "A008", new Date(116, 01, 01)));
		moneyTblVO.add(new moneyTblVO(100002, 20160004, 2000,1, 2000, "A004", new Date(116, 01, 02)));
		moneyTblVO.add(new moneyTblVO(100002, 20160005, 500, 1, 500, "A001", new Date(116, 01, 03)));
		moneyTblVO.add(new moneyTblVO(100003, 20160006, 1500, 2, 3000, "A003", new Date(116, 01, 03)));
		moneyTblVO.add(new moneyTblVO(100004, 20160007, 500, 2, 1000, "A001", new Date(116, 01, 04)));
		moneyTblVO.add(new moneyTblVO(100004, 20160008, 300, 1, 300, "A005", new Date(115, 11, 04)));
		moneyTblVO.add(new moneyTblVO(100004, 20160009, 600, 1, 600, "A006", new Date(115, 11, 04)));
		moneyTblVO.add(new moneyTblVO(100004, 201600010, 3000, 1, 3000, "A007", new Date(115, 11, 06)));
		
		
	}

}
