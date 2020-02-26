package javajungsuk2;
import java.util.Date;
//Value Object(VO) 데이터를 저장하는데 사용하는 객체
//set 메소드는 값을 저장 get 메소드는 값을 가져오는데 사용한다.

public class MemberVO { 
	private int custno;
	private String custname;
	private String phone;
	private String address;
	private Date joindate;
	private char grade;
	private String city;
	
	public int getCustno() {
		return custno;
	}
	public void setCustno(int custno) {
		this.custno = custno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
